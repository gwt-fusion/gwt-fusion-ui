import fs from 'node:fs';
import path from 'node:path';

const [, , sourceRootArg, outputDirArg] = process.argv;

if (!sourceRootArg || !outputDirArg) {
  console.error('Usage: node generate-phosphor-icons.mjs <phosphor-core-package-dir> <output-java-dir>');
  process.exit(1);
}

const sourceRoot = path.resolve(sourceRootArg);
const outputDir = path.resolve(outputDirArg);
const packageName = 'org.gwtfusion.icons.phosphor';
const maxChunkSize = 160;
const keywords = new Set([
  'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char', 'class', 'const',
  'continue', 'default', 'do', 'double', 'else', 'enum', 'extends', 'final', 'finally', 'float',
  'for', 'goto', 'if', 'implements', 'import', 'instanceof', 'int', 'interface', 'long', 'native',
  'new', 'package', 'private', 'protected', 'public', 'return', 'short', 'static', 'strictfp',
  'super', 'switch', 'synchronized', 'this', 'throw', 'throws', 'transient', 'try', 'void',
  'volatile', 'while'
]);
const weights = [
  { enumName: 'THIN', classPrefix: 'PhosphorIconsThin', dir: 'thin', suffix: '-thin', countName: 'THIN_COUNT' },
  { enumName: 'LIGHT', classPrefix: 'PhosphorIconsLight', dir: 'light', suffix: '-light', countName: 'LIGHT_COUNT' },
  { enumName: 'REGULAR', classPrefix: 'PhosphorIconsRegular', dir: 'regular', suffix: '', countName: 'REGULAR_COUNT' },
  { enumName: 'BOLD', classPrefix: 'PhosphorIconsBold', dir: 'bold', suffix: '-bold', countName: 'BOLD_COUNT' },
  { enumName: 'FILL', classPrefix: 'PhosphorIconsFill', dir: 'fill', suffix: '-fill', countName: 'FILL_COUNT' },
  { enumName: 'DUOTONE', classPrefix: 'PhosphorIconsDuotone', dir: 'duotone', suffix: '-duotone', countName: 'DUOTONE_COUNT' }
];

function javaString(value) {
  return String(value)
    .replace(/\\/g, '\\\\')
    .replace(/"/g, '\\"')
    .replace(/\r/g, '\\r')
    .replace(/\n/g, '\\n');
}

function methodName(name) {
  const parts = name.split(/[^a-zA-Z0-9]+/).filter(Boolean);
  let result = parts.map((part, index) => {
    const lower = part.toLowerCase();
    const normalized = /^[0-9]+$/.test(lower) ? `n${lower}` : lower;
    if (index === 0) {
      return normalized;
    }
    return normalized.charAt(0).toUpperCase() + normalized.slice(1);
  }).join('');
  if (!result || /^[0-9]/.test(result)) {
    result = 'icon' + parts.map(part => part.charAt(0).toUpperCase() + part.slice(1).toLowerCase()).join('');
  }
  if (keywords.has(result)) {
    result += 'Icon';
  }
  return result;
}

function parseAttributes(source) {
  const attrs = [];
  for (const match of source.matchAll(/([a-zA-Z_:][-a-zA-Z0-9_:.]*)="([^"]*)"/g)) {
    attrs.push([match[1], match[2]]);
  }
  return attrs;
}

function parseShapes(svg) {
  const shapes = [];
  for (const match of svg.matchAll(/<(path|circle|rect|line|polyline|polygon|ellipse)\b([^>]*)\/?>/g)) {
    shapes.push({ tag: match[1], attrs: parseAttributes(match[2]) });
  }
  return shapes;
}

function iconExpression(icon) {
  const calls = icon.shapes.map(shape => {
    const args = [shape.tag, ...shape.attrs.flat()].map(value => `"${javaString(value)}"`).join(', ');
    return `\n                .element(${args})`;
  }).join('');
  return `Icon.svg("0 0 256 256")\n                .theme(IconTheme.FILLED)${calls}`;
}

function iconName(file, weight) {
  return file.slice(0, -4).replace(new RegExp(`${weight.suffix}$`), '');
}

function groupKey(icon) {
  const first = icon.name.charAt(0).toUpperCase();
  return /^[A-Z]$/.test(first) ? first : 'Misc';
}

function chunkClassName(weight, key, index, total) {
  return `${weight.classPrefix}${key}${total > 1 ? index + 1 : ''}`;
}

function readIcons(weight) {
  const dir = path.join(sourceRoot, 'assets', weight.dir);
  return fs.readdirSync(dir)
    .filter(file => file.endsWith('.svg'))
    .map(file => {
      const name = iconName(file, weight);
      const svg = fs.readFileSync(path.join(dir, file), 'utf8');
      return { name, method: methodName(name), shapes: parseShapes(svg) };
    })
    .sort((a, b) => a.name.localeCompare(b.name));
}

fs.mkdirSync(outputDir, { recursive: true });
for (const file of fs.readdirSync(outputDir)) {
  if (file.startsWith('PhosphorIcon') && file.endsWith('.java')) {
    fs.rmSync(path.join(outputDir, file));
  }
}

const generated = weights.map(weight => ({ ...weight, icons: readIcons(weight), chunks: [] }));
const allIcons = [...new Map(generated.flatMap(weight => weight.icons).map(icon => [icon.name, icon])).values()]
  .sort((a, b) => a.name.localeCompare(b.name));

const seenMethods = new Set();
for (const icon of allIcons) {
  if (seenMethods.has(icon.method)) {
    throw new Error(`Duplicate Java method name: ${icon.method}`);
  }
  seenMethods.add(icon.method);
}

for (const weight of generated) {
  const grouped = new Map();
  for (const icon of weight.icons) {
    const key = groupKey(icon);
    if (!grouped.has(key)) {
      grouped.set(key, []);
    }
    grouped.get(key).push(icon);
  }
  for (const key of [...grouped.keys()].sort()) {
    const groupIcons = grouped.get(key);
    const chunks = [];
    for (let i = 0; i < groupIcons.length; i += maxChunkSize) {
      chunks.push(groupIcons.slice(i, i + maxChunkSize));
    }
    chunks.forEach((chunkIcons, index) => {
      const className = chunkClassName(weight, key, index, chunks.length);
      weight.chunks.push({ key, className, icons: chunkIcons });
      const names = chunkIcons.map(icon => `"${javaString(icon.name)}"`).join(', ');
      const lookup = chunkIcons.map(icon => `        if ("${javaString(icon.name)}".equals(name)) {\n            return ${icon.method}();\n        }`).join('\n');
      const methods = chunkIcons.map(icon => `    static Icon ${icon.method}() {\n        return ${iconExpression(icon)};\n    }`).join('\n\n');
      const source = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconTheme;\n\nfinal class ${className} {\n    private static final String[] NAMES = {${names}};\n\n    private ${className}() {\n    }\n\n    static String[] names() {\n        String[] names = new String[NAMES.length];\n        for (int i = 0; i < NAMES.length; i++) {\n            names[i] = NAMES[i];\n        }\n        return names;\n    }\n\n    static Icon icon(String name) {\n${lookup}\n        return null;\n    }\n\n${methods}\n}\n`;
      fs.writeFileSync(path.join(outputDir, `${className}.java`), source);
    });
  }
}

const weightEnum = `package ${packageName};\n\npublic enum PhosphorWeight {\n    THIN,\n    LIGHT,\n    REGULAR,\n    BOLD,\n    FILL,\n    DUOTONE\n}\n`;
fs.writeFileSync(path.join(outputDir, 'PhosphorWeight.java'), weightEnum);

function namesCase(weight) {
  const copies = weight.chunks.map(chunk => `        offset = copy(${chunk.className}.names(), names, offset);`).join('\n');
  return `    private static String[] ${weight.dir}Names() {\n        String[] names = new String[${weight.countName}];\n        int offset = 0;\n${copies}\n        return names;\n    }`;
}

function iconCase(weight) {
  const byKey = new Map();
  for (const chunk of weight.chunks) {
    if (!byKey.has(chunk.key)) {
      byKey.set(chunk.key, []);
    }
    byKey.get(chunk.key).push(chunk);
  }
  const cases = [...byKey.keys()].sort().map(key => {
    const firstName = byKey.get(key)[0].icons[0].name.charAt(0);
    const lookups = byKey.get(key).map(chunk => `                icon = ${chunk.className}.icon(name);\n                if (icon != null) {\n                    return icon;\n                }`).join('\n');
    return `            case '${javaString(firstName)}':\n${lookups}\n                return null;`;
  }).join('\n');
  return `    private static Icon ${weight.dir}Icon(String name) {\n        Icon icon;\n        switch (name.charAt(0)) {\n${cases}\n            default:\n                return null;\n        }\n    }`;
}

const countConstants = generated.map(weight => `    public static final int ${weight.countName} = ${weight.icons.length};`).join('\n');
const namesMethods = generated.map(namesCase).join('\n\n');
const iconMethods = generated.map(iconCase).join('\n\n');
const publicMethods = allIcons.map(icon => `    public static Icon ${icon.method}() {\n        return ${icon.method}(PhosphorWeight.REGULAR);\n    }\n\n    public static Icon ${icon.method}(PhosphorWeight weight) {\n        return icon("${javaString(icon.name)}", weight);\n    }`).join('\n\n');
const namesSwitch = generated.map(weight => `            case ${weight.enumName}:\n                return ${weight.dir}Names();`).join('\n');
const iconSwitch = generated.map(weight => `            case ${weight.enumName}:\n                return ${weight.dir}Icon(name);`).join('\n');
const countSwitch = generated.map(weight => `            case ${weight.enumName}:\n                return ${weight.countName};`).join('\n');
const phosphorIcons = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class PhosphorIcons {\n${countConstants}\n    public static final int COUNT = REGULAR_COUNT;\n\n    private PhosphorIcons() {\n    }\n\n    public static IconProvider provider() {\n        return provider(PhosphorWeight.REGULAR);\n    }\n\n    public static IconProvider provider(PhosphorWeight weight) {\n        return new PhosphorIconProvider(weight);\n    }\n\n    public static String[] names() {\n        return names(PhosphorWeight.REGULAR);\n    }\n\n    public static String[] names(PhosphorWeight weight) {\n        switch (normalize(weight)) {\n${namesSwitch}\n            default:\n                return regularNames();\n        }\n    }\n\n    public static Icon icon(String name) {\n        return icon(name, PhosphorWeight.REGULAR);\n    }\n\n    public static Icon icon(String name, PhosphorWeight weight) {\n        if (name == null || name.isEmpty()) {\n            return null;\n        }\n        switch (normalize(weight)) {\n${iconSwitch}\n            default:\n                return regularIcon(name);\n        }\n    }\n\n    static int count(PhosphorWeight weight) {\n        switch (normalize(weight)) {\n${countSwitch}\n            default:\n                return REGULAR_COUNT;\n        }\n    }\n\n    static PhosphorWeight normalize(PhosphorWeight weight) {\n        return weight == null ? PhosphorWeight.REGULAR : weight;\n    }\n\n    private static int copy(String[] source, String[] target, int offset) {\n        for (int i = 0; i < source.length; i++) {\n            target[offset + i] = source[i];\n        }\n        return offset + source.length;\n    }\n\n${namesMethods}\n\n${iconMethods}\n\n${publicMethods}\n}\n`;
fs.writeFileSync(path.join(outputDir, 'PhosphorIcons.java'), phosphorIcons);

const holderClasses = generated.map(weight => `        private static final class ${weight.enumName.charAt(0)}${weight.enumName.slice(1).toLowerCase()}Names {\n            private static final Set<String> HOLDER = names(PhosphorWeight.${weight.enumName});\n        }`).join('\n\n');
const holderSwitch = generated.map(weight => `                case ${weight.enumName}:\n                    return ${weight.enumName.charAt(0)}${weight.enumName.slice(1).toLowerCase()}Names.HOLDER;`).join('\n');
const provider = `package ${packageName};\n\nimport java.util.Collections;\nimport java.util.HashSet;\nimport java.util.Set;\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class PhosphorIconProvider implements IconProvider {\n    private final PhosphorWeight weight;\n\n    public PhosphorIconProvider() {\n        this(PhosphorWeight.REGULAR);\n    }\n\n    public PhosphorIconProvider(PhosphorWeight weight) {\n        this.weight = PhosphorIcons.normalize(weight);\n    }\n\n    @Override\n    public Icon icon(String name) {\n        return PhosphorIcons.icon(name, weight);\n    }\n\n    public PhosphorWeight weight() {\n        return weight;\n    }\n\n    public boolean supports(String name) {\n        return SupportedNames.namesFor(weight).contains(name);\n    }\n\n    private static final class SupportedNames {\n        private SupportedNames() {\n        }\n\n        private static Set<String> names(PhosphorWeight weight) {\n            Set<String> names = new HashSet<>();\n            for (String name : PhosphorIcons.names(weight)) {\n                names.add(name);\n            }\n            return Collections.unmodifiableSet(names);\n        }\n\n        private static Set<String> namesFor(PhosphorWeight weight) {\n            switch (PhosphorIcons.normalize(weight)) {\n${holderSwitch}\n                default:\n                    return RegularNames.HOLDER;\n            }\n        }\n\n${holderClasses}\n    }\n}\n`;
fs.writeFileSync(path.join(outputDir, 'PhosphorIconProvider.java'), provider);

console.log(`Generated ${generated.map(weight => `${weight.icons.length} ${weight.enumName}`).join(', ')} Phosphor icons in ${outputDir}`);
