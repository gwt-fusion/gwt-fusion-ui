const componentClasses = [
  'inline-flex', 'items-center', 'justify-center', 'gap-2', 'whitespace-nowrap',
  'rounded-md', 'rounded-lg', 'rounded', 'rounded-full', 'text-left', 'text-base', 'text-sm', 'text-xs', 'text-xl', 'text-2xl', 'text-4xl', 'font-medium', 'font-semibold', 'font-bold',
  'transition-colors', 'transition-transform', 'focus-visible:outline-none', 'focus-visible:ring-0', 'focus-visible:ring-1',
  'focus-visible:ring-ring', 'focus-within:ring-1', 'focus-within:ring-ring', 'disabled:pointer-events-none', 'disabled:opacity-50',
  'disabled:cursor-not-allowed', 'cursor-pointer', 'pointer-events-none',
  'bg-primary', 'bg-accent', 'bg-card', 'bg-popover', 'text-primary-foreground', 'text-accent-foreground', 'text-card-foreground', 'text-popover-foreground', 'hover:bg-primary/90',
  'bg-destructive', 'text-destructive-foreground', 'hover:bg-destructive/90',
  'border', 'border-0', 'border-2', 'border-input', 'border-primary', 'border-destructive', 'border-border', 'border-r', 'border-l', 'bg-background', 'hover:bg-accent', 'hover:text-accent-foreground',
  'bg-secondary', 'text-secondary-foreground', 'hover:bg-secondary/80',
  'hover:bg-accent', 'hover:text-accent-foreground', 'underline-offset-4', 'hover:underline',
  'h-2', 'h-4', 'h-5', 'h-8', 'h-9', 'h-10', 'h-11', 'h-full', 'w-4', 'w-9', 'w-full', 'min-w-0', 'min-w-9', 'px-1.5', 'px-2', 'px-3', 'px-4', 'px-8', 'py-0.5', 'py-1', 'py-2', 'py-4', 'pb-4', 'pl-4',
  'shadow', 'shadow-sm', 'shadow-none', 'min-h-9', 'min-h-12', 'min-h-16',
  'border-transparent', 'bg-transparent', 'bg-muted', 'bg-border', 'bg-input', 'text-foreground', 'text-muted-foreground', 'text-primary',
  'border-destructive/50', 'text-destructive', 'dark:border-destructive',
  'border-b', 'border-l-4', 'p-1', 'p-4', 'p-6', 'pt-0', 'space-y-1.5', 'mb-1', 'mt-2', 'mx-4',
  'grid', 'flex', 'inline-flex', 'flex-1', 'flex-col', 'flex-row', 'flex-wrap', 'gap-1', 'gap-2', 'gap-4', 'leading-7', 'leading-none', 'tracking-tight',
  'absolute', 'relative', 'inset-0', 'shrink-0', 'h-px', 'w-px',
  'translate-x-0', 'translate-x-4', 'accent-primary', 'appearance-none', 'overflow-hidden', 'overflow-auto',
  'hover:bg-background', 'hover:text-foreground', 'hover:text-primary', 'whitespace-pre', 'font-mono', 'italic',
  'file:border-0', 'file:bg-transparent', 'file:text-sm', 'file:font-medium',
  'placeholder:text-muted-foreground', 'selection:bg-primary', 'selection:text-primary-foreground'
];

module.exports = {
  darkMode: ['class'],
  content: [
    './src/main/java/**/*.java',
    '../gwt-fusion-ui-demo/src/main/java/**/*.java',
    '../gwt-fusion-ui-demo/src/main/webapp/**/*.html'
  ],
  safelist: componentClasses,
  theme: {
    extend: {
      colors: {
        border: 'hsl(var(--border))',
        input: 'hsl(var(--input))',
        ring: 'hsl(var(--ring))',
        background: 'hsl(var(--background))',
        foreground: 'hsl(var(--foreground))',
        card: {
          DEFAULT: 'hsl(var(--card))',
          foreground: 'hsl(var(--card-foreground))'
        },
        popover: {
          DEFAULT: 'hsl(var(--popover))',
          foreground: 'hsl(var(--popover-foreground))'
        },
        primary: {
          DEFAULT: 'hsl(var(--primary))',
          foreground: 'hsl(var(--primary-foreground))'
        },
        secondary: {
          DEFAULT: 'hsl(var(--secondary))',
          foreground: 'hsl(var(--secondary-foreground))'
        },
        destructive: {
          DEFAULT: 'hsl(var(--destructive))',
          foreground: 'hsl(var(--destructive-foreground))'
        },
        muted: {
          DEFAULT: 'hsl(var(--muted))',
          foreground: 'hsl(var(--muted-foreground))'
        },
        accent: {
          DEFAULT: 'hsl(var(--accent))',
          foreground: 'hsl(var(--accent-foreground))'
        }
      }
    }
  },
  plugins: []
};
