package org.gwtfusion.query.ui;

import org.gwtfusion.query.QueryState;
import org.gwtfusion.ui.UiComponent;

@FunctionalInterface
public interface QueryViewRenderer<T> {
    UiComponent render(QueryState<T> state, Runnable retry);
}
