package org.gwtfusion.query.ui;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import elemental2.promise.Promise;
import java.util.function.Predicate;
import org.gwtfusion.query.ListenerRegistration;
import org.gwtfusion.query.Query;
import org.gwtfusion.query.QueryState;
import org.gwtfusion.ui.BaseComponent;
import org.gwtfusion.ui.UiComponent;
import org.gwtfusion.ui.component.alert.Alert;
import org.gwtfusion.ui.component.alert.AlertVariant;
import org.gwtfusion.ui.component.button.Button;
import org.gwtfusion.ui.component.button.ButtonVariant;
import org.gwtfusion.ui.component.emptystate.EmptyState;
import org.gwtfusion.ui.component.skeleton.Skeleton;

public final class QueryView<T> extends BaseComponent<QueryView<T>> {
    private final Query<T> query;
    private final ListenerRegistration registration;
    private Predicate<? super T> emptyPredicate = data -> false;
    private QueryViewRenderer<T> idleRenderer = QueryView::defaultIdle;
    private QueryViewRenderer<T> loadingRenderer = QueryView::defaultLoading;
    private QueryViewRenderer<T> errorRenderer = QueryView::defaultError;
    private QueryViewRenderer<T> emptyRenderer = QueryView::defaultEmpty;
    private QueryViewRenderer<T> successRenderer = QueryView::defaultSuccess;
    private QueryState<T> state = QueryState.idle();

    private QueryView(HTMLElement element, Query<T> query) {
        super(element);
        if (query == null) {
            throw new IllegalArgumentException("query must not be null");
        }
        this.query = query;
        classes("w-full");
        aria("live", "polite");
        registration = query.observe(this::render);
    }

    public static <T> QueryView<T> create(Query<T> query) {
        return new QueryView<>((HTMLElement) DomGlobal.document.createElement("div"), query);
    }

    public QueryView<T> idle(QueryViewRenderer<T> renderer) {
        idleRenderer = renderer == null ? QueryView::defaultIdle : renderer;
        return renderCurrent();
    }

    public QueryView<T> loading(QueryViewRenderer<T> renderer) {
        loadingRenderer = renderer == null ? QueryView::defaultLoading : renderer;
        return renderCurrent();
    }

    public QueryView<T> error(QueryViewRenderer<T> renderer) {
        errorRenderer = renderer == null ? QueryView::defaultError : renderer;
        return renderCurrent();
    }

    public QueryView<T> emptyWhen(Predicate<? super T> predicate) {
        emptyPredicate = predicate == null ? data -> false : predicate;
        return renderCurrent();
    }

    public QueryView<T> empty(QueryViewRenderer<T> renderer) {
        emptyRenderer = renderer == null ? QueryView::defaultEmpty : renderer;
        return renderCurrent();
    }

    public QueryView<T> success(QueryViewRenderer<T> renderer) {
        successRenderer = renderer == null ? QueryView::defaultSuccess : renderer;
        return renderCurrent();
    }

    public QueryViewPhase phase() {
        return QueryViewStateSelector.select(state, emptyPredicate);
    }

    public void dispose() {
        registration.remove();
    }

    private void render(QueryState<T> state) {
        this.state = state == null ? QueryState.idle() : state;
        QueryViewPhase phase = phase();
        QueryViewRenderer<T> renderer = renderer(phase);
        clear();
        data("state", phase.name().toLowerCase());
        aria("busy", String.valueOf(this.state.fetching()));
        UiComponent component = renderer.render(this.state, this::retry);
        if (component != null) {
            element().appendChild(component.element());
        }
    }

    private QueryView<T> renderCurrent() {
        render(state);
        return this;
    }

    private QueryViewRenderer<T> renderer(QueryViewPhase phase) {
        switch (phase) {
            case LOADING:
                return loadingRenderer;
            case ERROR:
                return errorRenderer;
            case EMPTY:
                return emptyRenderer;
            case SUCCESS:
                return successRenderer;
            case IDLE:
            default:
                return idleRenderer;
        }
    }

    private void clear() {
        while (element().firstChild != null) {
            element().removeChild(element().firstChild);
        }
    }

    private void retry() {
        query.refetch().then(Promise::resolve, error -> Promise.resolve((T) null));
    }

    private static <T> UiComponent defaultIdle(QueryState<T> state, Runnable retry) {
        return EmptyState.create()
                .title("Ready to load")
                .description("Start the query when data is needed.")
                .action(Button.create("Load data").onClick(event -> retry.run()));
    }

    private static <T> UiComponent defaultLoading(QueryState<T> state, Runnable retry) {
        HTMLElement loading = (HTMLElement) DomGlobal.document.createElement("div");
        loading.className = "space-y-3";
        HTMLElement status = (HTMLElement) DomGlobal.document.createElement("p");
        status.className = "sr-only";
        status.setAttribute("role", "status");
        status.textContent = "Loading data";
        loading.appendChild(status);
        loading.appendChild(Skeleton.create().size("h-32 w-full").element());
        return () -> loading;
    }

    private static <T> UiComponent defaultError(QueryState<T> state, Runnable retry) {
        return Alert.create()
                .variant(AlertVariant.DESTRUCTIVE)
                .add(Alert.title("Unable to load data"))
                .add(Alert.description(state.errorMessage()))
                .add(Button.create("Retry").variant(ButtonVariant.OUTLINE).onClick(event -> retry.run()));
    }

    private static <T> UiComponent defaultEmpty(QueryState<T> state, Runnable retry) {
        return EmptyState.create()
                .title("No results")
                .description("The query completed without matching data.");
    }

    private static <T> UiComponent defaultSuccess(QueryState<T> state, Runnable retry) {
        return EmptyState.create()
                .title("Data loaded")
                .description("Configure a success renderer to display the query result.");
    }
}
