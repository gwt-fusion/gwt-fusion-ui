package org.gwtfusion.query;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class QueryKeyTest {
    @Test
    void normalizesPartsAndSupportsPrefixMatching() {
        QueryKey users = QueryKey.of(" users ", "list");
        QueryKey detail = QueryKey.of("users").append("list").append("active");

        assertEquals("users/list", users.value());
        assertEquals("users/list/active", detail.value());
        assertTrue(detail.startsWith(users));
        assertEquals(QueryKey.of("users", "list"), users);
    }

    @Test
    void rejectsEmptyKeys() {
        assertThrows(IllegalArgumentException.class, () -> QueryKey.of(" ", null));
    }
}
