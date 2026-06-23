package org.gwtfusion.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MutationTest {
    @Test
    void rejectsNullOptions() {
        assertThrows(IllegalArgumentException.class, () -> Mutation.create(null));
    }

    @Test
    void supportsStateObserversRemovalAndReset() {
        Mutation<String, String> mutation = Mutation.create(() -> 10, MutationOptions.<String, String>create(value -> null));
        List<MutationStatus> statuses = new ArrayList<>();
        ListenerRegistration registration = mutation.observe(state -> statuses.add(state.status()));

        mutation.setState(MutationState.loading(null));
        mutation.setState(MutationState.success("saved", 10));
        registration.remove();
        mutation.reset();

        assertEquals(3, statuses.size());
        assertEquals(MutationStatus.IDLE, statuses.get(0));
        assertEquals(MutationStatus.LOADING, statuses.get(1));
        assertEquals(MutationStatus.SUCCESS, statuses.get(2));
        assertEquals(MutationStatus.IDLE, mutation.state().status());
    }

    @Test
    void optimisticUpdateHookRunsBeforeMutation() {
        List<String> values = new ArrayList<>();
        MutationOptions<String, String> options = MutationOptions.<String, String>create(value -> null)
                .onMutate(values::add);
        Mutation<String, String> mutation = Mutation.create(() -> 0, options);

        options.optimisticUpdate("Ada");

        assertEquals("Ada", values.get(0));
        assertEquals(MutationStatus.IDLE, mutation.state().status());
    }
}
