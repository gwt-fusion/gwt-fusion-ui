# Release Readiness

Milestone 14 hardens the project for release by making build expectations, compatibility checks, test strategy, generated artifacts, and deployment verification explicit.

## Required Checks

Run these checks before merging release-sensitive changes:

```bash
mvn -Dskip.tailwind=true verify
mvn -pl gwt-fusion-ui generate-resources
mvn -Pdemo -pl gwt-fusion-ui-demo -am -Dskip.tailwind=true package
```

The pull-request workflow runs the same Maven verify, CSS build, and demo GWT compile checks.

## J2CL And GWT Compatibility

The current compatibility gate is the standard JVM test suite plus the demo GWT compile. This catches accidental server-side Java usage, missing translatable APIs, and dependency issues while keeping the build simple.

Use the existing `j2cl-compat` Maven profile as the documented compatibility entry point when a J2CL-specific check is needed later:

```bash
mvn -Pj2cl-compat verify
```

The profile currently skips Tailwind downloads and keeps the build focused on Java compatibility. A stricter J2CL compiler integration should be added only when it can run reliably in Maven and CI without duplicating the demo GWT compile.

## Browser Test Strategy

The current browser smoke gate is the demo GWT compile and the GitHub Pages deployment workflow. This confirms that the demo application compiles to browser JavaScript and that the static site can be assembled and published.

Playwright is intentionally deferred. When browser regressions justify the extra dependency, add Playwright against a locally served `gwt-fusion-ui-demo/target/gwt-fusion-ui-demo-*` directory in pull requests. Do not use the live GitHub Pages URL as the only PR test because it represents the last deployed `main`, not the proposed branch.

## Tailwind Safelist Strategy

Tailwind should discover classes from Java sources whenever possible. Keep classes static in Java string constants and avoid dynamic class construction.

The manual safelist in `gwt-fusion-ui/tailwind.config.js` remains the release strategy for classes that Tailwind may not reliably discover. Do not add a safelist generator yet; the current component set is small enough that generation would add more maintenance risk than value.

## Demo And Test Coverage

Every public component listed in `docs/components-index.json` has a component demo entry in `DemoApp`. Components should also have at least one pure JVM test that covers enum mappings, static classes, API contracts, or pure state helpers.

Avoid tests that instantiate DOM nodes through `DomGlobal.document` in the JVM test suite. Add browser or GWT tests separately when runtime DOM behavior needs coverage.

## Licenses And Attribution

The project root contains the project `LICENSE`. The generated Lucide module includes `gwt-fusion-icons-lucide/src/main/resources/META-INF/LICENSE-LUCIDE.txt` and should keep icon attribution in distributable artifacts.

Future icon packs must include their own license and attribution files before release.

## Generated Artifacts

Build output belongs under `target/` and remains ignored by Git. Node-managed dependencies and local Node downloads remain ignored through `node_modules/` and `node/`.

Checked-in generated source is allowed only when it is intentional source distribution, such as generated Lucide Java factories. Tailwind output generated under `gwt-fusion-ui/target/generated-resources` is not checked in; the lightweight fallback CSS under `src/main/resources` is checked in intentionally.

## GitHub Pages Deployment

The deploy workflow builds UI CSS, compiles the GWT demo, copies agent docs, publishes the generated CSS, removes server-only metadata, and deploys through GitHub Pages. Treat this as the deployment smoke test for `main`.
