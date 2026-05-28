import fs from 'node:fs';
import path from 'node:path';

const [, , sourceDirArg, outputDirArg] = process.argv;

if (!sourceDirArg || !outputDirArg) {
  console.error('Usage: node generate-tabler-icons.mjs <tabler-outline-icons-dir> <output-java-dir>');
  process.exit(1);
}

const sourceDir = path.resolve(sourceDirArg);
const outputDir = path.resolve(outputDirArg);
const packageName = 'org.gwtfusion.icons.tabler';
const maxChunkSize = 180;
const keywords = new Set([
  'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char', 'class', 'const',
  'continue', 'default', 'do', 'double', 'else', 'enum', 'extends', 'final', 'finally', 'float',
  'for', 'goto', 'if', 'implements', 'import', 'instanceof', 'int', 'interface', 'long', 'native',
  'new', 'package', 'private', 'protected', 'public', 'return', 'short', 'static', 'strictfp',
  'super', 'switch', 'synchronized', 'this', 'throw', 'throws', 'transient', 'try', 'void',
  'volatile', 'while'
]);

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
  for (const match of svg.matchAll(/<(path|circle|rect|line|polyline|polygon|ellipse)\b([^>]*)\/?\s*>/g)) {
    shapes.push({ tag: match[1], attrs: parseAttributes(match[2]) });
  }
  return shapes;
}

function iconExpression(icon) {
  const calls = icon.shapes.map(shape => {
    const args = [shape.tag, ...shape.attrs.flat()].map(value => `"${javaString(value)}"`).join(', ');
    return `\n                .element(${args})`;
  }).join('');
  return `Icon.create()${calls}`;
}

function groupKey(icon) {
  const first = icon.name.charAt(0).toUpperCase();
  return /^[A-Z]$/.test(first) ? first : 'Misc';
}

function chunkClassName(key, index, total) {
  return `TablerIcons${key}${total > 1 ? index + 1 : ''}`;
}

const icons = fs.readdirSync(sourceDir)
  .filter(file => file.endsWith('.svg'))
  .map(file => {
    const name = file.slice(0, -4);
    const svg = fs.readFileSync(path.join(sourceDir, file), 'utf8');
    return { name, method: methodName(name), shapes: parseShapes(svg) };
  })
  .sort((a, b) => a.name.localeCompare(b.name));

const seenMethods = new Set();
for (const icon of icons) {
  if (seenMethods.has(icon.method)) {
    throw new Error(`Duplicate Java method name: ${icon.method}`);
  }
  seenMethods.add(icon.method);
}

fs.mkdirSync(outputDir, { recursive: true });
for (const file of fs.readdirSync(outputDir)) {
  if (file.startsWith('TablerIcon') && file.endsWith('.java')) {
    fs.rmSync(path.join(outputDir, file));
  }
}

const grouped = new Map();
for (const icon of icons) {
  const key = groupKey(icon);
  if (!grouped.has(key)) {
    grouped.set(key, []);
  }
  grouped.get(key).push(icon);
}

const groups = [...grouped.keys()].sort().map(key => {
  const groupIcons = grouped.get(key);
  const chunks = [];
  for (let i = 0; i < groupIcons.length; i += maxChunkSize) {
    chunks.push(groupIcons.slice(i, i + maxChunkSize));
  }
  return { key, chunks };
});

const chunkDescriptors = [];

for (const group of groups) {
  group.chunks.forEach((chunkIcons, index) => {
    const className = chunkClassName(group.key, index, group.chunks.length);
    chunkDescriptors.push({ key: group.key, className, icons: chunkIcons });
    const names = chunkIcons.map(icon => `"${javaString(icon.name)}"`).join(', ');
    const lookup = chunkIcons.map(icon => `        if ("${javaString(icon.name)}".equals(name)) {\n            return ${icon.method}();\n        }`).join('\n');
    const methods = chunkIcons.map(icon => `    static Icon ${icon.method}() {\n        return ${iconExpression(icon)};\n    }`).join('\n\n');
    const source = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\n\nfinal class ${className} {\n    private static final String[] NAMES = {${names}};\n\n    private ${className}() {\n    }\n\n    static String[] names() {\n        return NAMES.clone();\n    }\n\n    static Icon icon(String name) {\n${lookup}\n        return null;\n    }\n\n${methods}\n}\n`;
    fs.writeFileSync(path.join(outputDir, `${className}.java`), source);
  });
}

const publicMethods = icons.map(icon => {
  const descriptor = chunkDescriptors.find(chunk => chunk.icons.includes(icon));
  return `    public static Icon ${icon.method}() {\n        return ${descriptor.className}.${icon.method}();\n    }`;
}).join('\n\n');
const nameCopies = chunkDescriptors.map(chunk => `        offset = copy(${chunk.className}.names(), names, offset);`).join('\n');
const dispatch = groups.map(group => {
  const firstName = grouped.get(group.key)[0].name.charAt(0);
  const lookups = group.chunks.map((_, index) => {
    const className = chunkClassName(group.key, index, group.chunks.length);
    return `                icon = ${className}.icon(name);\n                if (icon != null) {\n                    return icon;\n                }`;
  }).join('\n');
  return `            case '${javaString(firstName)}':\n${lookups}\n                return null;`;
}).join('\n');

const tablerIcons = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class TablerIcons {\n    public static final int COUNT = ${icons.length};\n\n    private TablerIcons() {\n    }\n\n    public static IconProvider provider() {\n        return new TablerIconProvider();\n    }\n\n    public static String[] names() {\n        String[] names = new String[COUNT];\n        int offset = 0;\n${nameCopies}\n        return names;\n    }\n\n    public static Icon icon(String name) {\n        if (name == null || name.isEmpty()) {\n            return null;\n        }\n        Icon icon;\n        switch (name.charAt(0)) {\n${dispatch}\n            default:\n                return null;\n        }\n    }\n\n    private static int copy(String[] source, String[] target, int offset) {\n        for (int i = 0; i < source.length; i++) {\n            target[offset + i] = source[i];\n        }\n        return offset + source.length;\n    }\n\n${publicMethods}\n}\n`;
fs.writeFileSync(path.join(outputDir, 'TablerIcons.java'), tablerIcons);

const provider = `package ${packageName};\n\nimport org.gwtfusion.ui.component.icon.Icon;\nimport org.gwtfusion.ui.component.icon.IconProvider;\n\npublic final class TablerIconProvider implements IconProvider {\n    @Override\n    public Icon icon(String name) {\n        return TablerIcons.icon(name);\n    }\n\n    public boolean supports(String name) {\n        for (String supportedName : TablerIcons.names()) {\n            if (supportedName.equals(name)) {\n                return true;\n            }\n        }\n        return false;\n    }\n}\n`;
fs.writeFileSync(path.join(outputDir, 'TablerIconProvider.java'), provider);

console.log(`Generated ${icons.length} Tabler icons in ${outputDir}`);
