package org.gwtfusion.router;

import elemental2.dom.HTMLElement;

@FunctionalInterface
public interface RouteRenderer {
    HTMLElement render(RouteContext context);
}
