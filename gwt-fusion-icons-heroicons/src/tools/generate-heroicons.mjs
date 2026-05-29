import fs from 'node:fs';
import path from 'node:path';

const [, , sourceRootArg, outputDirArg] = process.argv;

if (!sourceRootArg || !outputDirArg) {
  console.error('Usage: node generate-heroicons.mjs <heroicons-react-package-dir> <output-java-dir>');
  process.exit(1);
}

const sourceRoot = path.resolve(sourceRootArg);
const outputDir = path.resolve(outputDirArg);
const packageName = 'org.gwtfusion.icons.heroicons';
const keywords = new Set([
  'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char', 'class', 'const',
  'continue', 'default', 'do', 'double', 'else', 'enum', 'extends', 'final', 'finally', 'float',
  'for', 'goto', 'if', 'implements', 'import', 'instanceof', 'int', 'interface', 'long', 'native',
  'new', 'package', 'private', 'protected', 'public', 'return', 'short', 'static', 'strictfp',
  'super', 'switch', 'synchronized', 'this', 'throw', 'throws', 'transient', 'try', 'void',
  'volatile', 'while'
]);
const styles = [
  { enumName: 'OUTLINE', className: 'HeroIconsOutline', dir: '24/outline', countName: 'OUTLINE_COUNT', viewBox: '0 0 24 24', theme: 'IconTheme.STROKE', strokeWidth: '1.5' },
  { enumName: 'SOLID', className: 'HeroIconsSolid', dir: '24/solid', countName: 'SOLID_COUNT', viewBox: '0 0 24 24', theme: 'IconTheme.FILLED' },
  { enumName: 'MINI', className: 'HeroIconsMini', dir: '20/solid', countName: 'MINI_COUNT', viewBox: '0 0 20 20', theme: 'IconTheme.FILLED' },
  { enumName: 'MICRO', className: 'HeroIconsMicro', dir: '16/solid', countName: 'MICRO_COUNT', viewBox: '0 0 16 16', theme: 'IconTheme.FILLED' }
];

function javaString(value) {
  return String(value)
    .replace(/\\/g, '\\\\')
    .replace(/"/g, '\\"')
    .replace(/\r/g, '\\r')
    .replace(/\n/g, '\\n');
}

function pascalParts(name) {
  return name.match(/[A-Z]?[a-z]+|[0-9]+|[A-Z]+(?![a-z])/g) || [name];
}

function iconName(file) {
  const base = file.replace(/Icon\.js$/, '');
  const parts = pascalParts(base);
  const result = [];
  for (let i = 0; i < parts.length; i++) {
    const part = parts[i];
    if (i === 0 && /^[A-Z]$/.test(part) && /^[0-9]+$/.test(parts[i + 1] || '')) {
      result.push((part + parts[i + 1]).toLowerCase());
      i++;
    } else if (/^[0-9]+$/.test(part) && /^[A-Z]$/.test(parts[i + 1] || '')) {
      result.push((part + parts[i + 1]).toLowerCase());
      i++;
    } else {
      result.push(part.toLowerCase());
    }
  }
  return result.join('-');
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

function svgAttribute(name) {
  if (name.startsWith('"') && name.endsWith('"')) {
    return name.slice(1, -1);
  }
  return name.replace(/[A-Z]/g, match => `-${match.toLowerCase()}`);
}

function parseAttributes(source) {
  const attrs = [];
  const pattern = /("[-a-zA-Z0-9:]+"|[a-zA-Z_$][a-zA-Z0-9_$]*)\s*:\s*("([^"]*)"|[0-9.]+|true|false|null)\s*,?/g;
  for (const match of source.matchAll(pattern)) {
    const value = match[3] === undefined ? match[2] : match[3];
    attrs.push([svgAttribute(match[1]), value]);
  }
  return attrs;
}

function parseShapes(source) {
  const shapes = [];
  const pattern = /React\.createElement\("(path|circle|rect|line|polyline|polygon|ellipse)", \{([\s\S]*?)\}\)/g;
  for (const match of source.matchAll(pattern)) {
    shapes.push({ tag: match[1], attrs: parseAttributes(match[2]) });
  }
  return shapes;
}

function iconExpression(icon, style) {
  const calls = icon.shapes.map(shape => {
    const args = [shape.tag, ...shape.attrs.flat()].map(value => `"${javaString(value)}"`).join(', ');
    return `\n                .element(${args})`;
  }).join('');
  const strokeWidth = style.strokeWidth ? `\n                .strokeWidth(${style.strokeWidth})` : '';
  return `Icon.svg("${style.viewBox}")\n                .theme(${style.theme})${strokeWidth}${calls}`;
}

function readIcons(style) {
  const dir = path.join(sourceRoot, style.dir);
  return fs.readdirSync(dir)
    .filter(file => file.endsWith('Icon.js'))
    .map(file => {
      const name = iconName(file);
      const source = fs.readFileSync(path.join(dir, file), 'utf8');
      return { name, method: methodName(name), shapes: parseShapes(source) };
    })
    .sort((a, b) => a.name.localeCompare(b.name));
}

fs.mkdirSync(outputDir, { recursive: true });
for (const file of fs.readdirSync(outputDir)) {
  if (file.startsWith('HeroIcon') && file.endsWith('.java')) {
    fs.rmSync(path.join(outputDir, file));
  }
}

const generated = styles.map(style => ({ ...style, icons: readIcons(style) }));
const allIcons = [...new Map(generated.flatMap(style => style.icons).map(icon => [icon.name, icon])).values()]
  .sort((a, b) => a.name.localeCompare(b.name));

const seenMethods = new Set();
for (const icon of allIcons) {
  if (seenMethods.has(icon.method)) {
    throw new Error(`Duplicate Java method name: ${icon.method}`);
  }
  seenMethods.add(icon.method);
}

for (const style of generated) {
  const names = style.icons.map(icon => `"${javaString(icon.name)}"`).join(', ');
  const lookup = style.icons.map(icon => `        if ("${javaString(icon.name)}".equals(name)) {\n            return ${icon.method}();\n        }`).join('\n');
  const methods = style.icons.map(icon => `    static Icon ${icon.method}() {\n        return ${iconExpression(icon, style)};\n    }`).join('\n\n');
  const source = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconTheme;\n\nfinal class ${style.className} {\n    private static final String[] NAMES = {${names}};\n\n    private ${style.className}() {\n    }\n\n    static String[] names() {\n        String[] names = new String[NAMES.length];\n        for (int i = 0; i < NAMES.length; i++) {\n            names[i] = NAMES[i];\n        }\n        return names;\n    }\n\n    static Icon icon(String name) {\n${lookup}\n        return null;\n    }\n\n${methods}\n}\n`;
  fs.writeFileSync(path.join(outputDir, `${style.className}.java`), source);
}

const styleEnum = `package ${packageName};\n\npublic enum HeroIconStyle {\n    OUTLINE,\n    SOLID,\n    MINI,\n    MICRO\n}\n`;
fs.writeFileSync(path.join(outputDir, 'HeroIconStyle.java'), styleEnum);

const countConstants = generated.map(style => `    public static final int ${style.countName} = ${style.icons.length};`).join('\n');
const publicMethods = allIcons.map(icon => `    public static Icon ${icon.method}() {\n        return ${icon.method}(HeroIconStyle.OUTLINE);\n    }\n\n    public static Icon ${icon.method}(HeroIconStyle style) {\n        return icon("${javaString(icon.name)}", style);\n    }`).join('\n\n');
const heroIcons = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class HeroIcons {\n${countConstants}\n    public static final int COUNT = OUTLINE_COUNT;\n\n    private HeroIcons() {\n    }\n\n    public static IconProvider provider() {\n        return provider(HeroIconStyle.OUTLINE);\n    }\n\n    public static IconProvider provider(HeroIconStyle style) {\n        return new HeroIconProvider(style);\n    }\n\n    public static String[] names() {\n        return names(HeroIconStyle.OUTLINE);\n    }\n\n    public static String[] names(HeroIconStyle style) {\n        switch (normalize(style)) {\n            case SOLID:\n                return HeroIconsSolid.names();\n            case MINI:\n                return HeroIconsMini.names();\n            case MICRO:\n                return HeroIconsMicro.names();\n            case OUTLINE:\n            default:\n                return HeroIconsOutline.names();\n        }\n    }\n\n    public static Icon icon(String name) {\n        return icon(name, HeroIconStyle.OUTLINE);\n    }\n\n    public static Icon icon(String name, HeroIconStyle style) {\n        if (name == null || name.isEmpty()) {\n            return null;\n        }\n        switch (normalize(style)) {\n            case SOLID:\n                return HeroIconsSolid.icon(name);\n            case MINI:\n                return HeroIconsMini.icon(name);\n            case MICRO:\n                return HeroIconsMicro.icon(name);\n            case OUTLINE:\n            default:\n                return HeroIconsOutline.icon(name);\n        }\n    }\n\n    static int count(HeroIconStyle style) {\n        switch (normalize(style)) {\n            case SOLID:\n                return SOLID_COUNT;\n            case MINI:\n                return MINI_COUNT;\n            case MICRO:\n                return MICRO_COUNT;\n            case OUTLINE:\n            default:\n                return OUTLINE_COUNT;\n        }\n    }\n\n    static HeroIconStyle normalize(HeroIconStyle style) {\n        return style == null ? HeroIconStyle.OUTLINE : style;\n    }\n\n${publicMethods}\n}\n`;
fs.writeFileSync(path.join(outputDir, 'HeroIcons.java'), heroIcons);

const provider = `package ${packageName};\n\nimport java.util.Collections;\nimport java.util.HashSet;\nimport java.util.Set;\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class HeroIconProvider implements IconProvider {\n    private final HeroIconStyle style;\n\n    public HeroIconProvider() {\n        this(HeroIconStyle.OUTLINE);\n    }\n\n    public HeroIconProvider(HeroIconStyle style) {\n        this.style = HeroIcons.normalize(style);\n    }\n\n    @Override\n    public Icon icon(String name) {\n        return HeroIcons.icon(name, style);\n    }\n\n    public HeroIconStyle style() {\n        return style;\n    }\n\n    public boolean supports(String name) {\n        return SupportedNames.namesFor(style).contains(name);\n    }\n\n    private static final class SupportedNames {\n        private SupportedNames() {\n        }\n\n        private static Set<String> names(HeroIconStyle style) {\n            Set<String> names = new HashSet<>();\n            for (String name : HeroIcons.names(style)) {\n                names.add(name);\n            }\n            return Collections.unmodifiableSet(names);\n        }\n\n        private static Set<String> namesFor(HeroIconStyle style) {\n            switch (HeroIcons.normalize(style)) {\n                case SOLID:\n                    return SolidNames.HOLDER;\n                case MINI:\n                    return MiniNames.HOLDER;\n                case MICRO:\n                    return MicroNames.HOLDER;\n                case OUTLINE:\n                default:\n                    return OutlineNames.HOLDER;\n            }\n        }\n\n        private static final class OutlineNames {\n            private static final Set<String> HOLDER = names(HeroIconStyle.OUTLINE);\n        }\n\n        private static final class SolidNames {\n            private static final Set<String> HOLDER = names(HeroIconStyle.SOLID);\n        }\n\n        private static final class MiniNames {\n            private static final Set<String> HOLDER = names(HeroIconStyle.MINI);\n        }\n\n        private static final class MicroNames {\n            private static final Set<String> HOLDER = names(HeroIconStyle.MICRO);\n        }\n    }\n}\n`;
fs.writeFileSync(path.join(outputDir, 'HeroIconProvider.java'), provider);

console.log(`Generated ${generated.map(style => `${style.icons.length} ${style.enumName}`).join(', ')} Heroicons in ${outputDir}`);
