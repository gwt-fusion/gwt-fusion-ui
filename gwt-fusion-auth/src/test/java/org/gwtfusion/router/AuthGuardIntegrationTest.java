package org.gwtfusion.router;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.auth.AuthGuard;
import org.gwtfusion.auth.AuthManager;
import org.gwtfusion.auth.AuthSession;
import org.gwtfusion.auth.AuthToken;
import org.gwtfusion.auth.AuthUser;
import org.junit.jupiter.api.Test;

class AuthGuardIntegrationTest {
    @Test
    void reevaluatesLoadingGuardOnceWhenAuthBecomesReady() {
        AuthManager auth = AuthManager.create().loading();
        RecordingHistoryStrategy history = new RecordingHistoryStrategy("/account");
        Router router = Router.create(history);
        Route route = Route.of("/account", AuthGuard.requireAuthenticated(auth, context -> null, "/login"));
        RouteContext context = context(router, route, "/account");

        assertNull(route.renderer().render(context));
        assertNull(route.renderer().render(context));

        auth.login(AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("token")));
        auth.logout();

        assertEquals(1, history.replacedPaths.size());
        assertEquals("/account", history.replacedPaths.get(0));
    }

    @Test
    void doesNotReturnToGuardedRouteAfterUserNavigatesAway() {
        AuthManager auth = AuthManager.create().loading();
        RecordingHistoryStrategy history = new RecordingHistoryStrategy("/account");
        Router router = Router.create(history);
        Route route = Route.of("/account", AuthGuard.requireAuthenticated(auth, context -> null, "/login"));

        assertNull(route.renderer().render(context(router, route, "/account")));
        history.setLocation(RouteLocation.parse("/public"));
        auth.login(AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("token")));

        assertEquals(0, history.replacedPaths.size());
    }

    private static RouteContext context(Router router, Route route, String path) {
        RouteLocation location = RouteLocation.parse(path);
        return new RouteContext(router, route.match(location));
    }

    private static final class RecordingHistoryStrategy implements HistoryStrategy {
        private final List<LocationChangeListener> listeners = new ArrayList<>();
        private final List<String> replacedPaths = new ArrayList<>();
        private RouteLocation location;

        RecordingHistoryStrategy(String location) {
            this.location = RouteLocation.parse(location);
        }

        @Override
        public RouteLocation location() {
            return location;
        }

        @Override
        public void push(RouteLocation location) {
            setLocation(location);
        }

        @Override
        public void replace(RouteLocation location) {
            replacedPaths.add(location.asPath());
            setLocation(location);
        }

        @Override
        public String href(String path) {
            return RouteLocation.parse(path).asPath();
        }

        @Override
        public ListenerRegistration listen(LocationChangeListener listener) {
            listeners.add(listener);
            return () -> listeners.remove(listener);
        }

        void setLocation(RouteLocation location) {
            this.location = location == null ? RouteLocation.parse("/") : location;
            List<LocationChangeListener> snapshot = new ArrayList<>(listeners);
            for (LocationChangeListener listener : snapshot) {
                listener.onLocationChange(this.location);
            }
        }
    }
}
