package org.gwtfusion.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;
import org.gwtfusion.router.ListenerRegistration;
import org.junit.jupiter.api.Test;

class AuthManagerTest {
    @Test
    void notifiesListenersForStateTransitionsAndSupportsRemoval() {
        AuthManager auth = AuthManager.create();
        List<AuthStatus> statuses = new ArrayList<>();
        ListenerRegistration registration = auth.onStateChange(state -> statuses.add(state.status()));

        auth.loading();
        auth.login(AuthSession.of(AuthUser.of("u1")));
        registration.remove();
        auth.logout();

        assertEquals(2, statuses.size());
        assertEquals(AuthStatus.LOADING, statuses.get(0));
        assertEquals(AuthStatus.AUTHENTICATED, statuses.get(1));
    }

    @Test
    void refreshHandlerCanCompleteFailOrLogout() {
        AuthManager auth = AuthManager.create();
        AuthSession original = AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("old"));
        AuthSession refreshed = AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("new"));
        auth.login(original);

        auth.refresh(context -> {
            assertSame(original, context.session());
            context.complete(refreshed);
        });

        assertEquals(AuthStatus.AUTHENTICATED, auth.state().status());
        assertEquals("new", auth.session().accessToken().value());

        auth.refresh(context -> context.fail("refresh failed"));
        assertEquals(AuthStatus.FAILED, auth.state().status());
        assertEquals("refresh failed", auth.state().message());
    }

    @Test
    void refreshHandlerExceptionFailsInsteadOfLeavingLoadingState() {
        AuthManager auth = AuthManager.create()
                .login(AuthSession.of(AuthUser.of("u1"), AuthToken.bearer("old")));

        auth.refresh(context -> {
            throw new RuntimeException("boom");
        });

        assertEquals(AuthStatus.FAILED, auth.state().status());
        assertEquals("boom", auth.state().message());
    }
}
