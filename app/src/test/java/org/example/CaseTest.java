package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaseTest {

    @Test
    public void testManualCaseConstruction() {
        Case c = new Case("C-001", "CRIMINAL", 150, "PENDING");

        assertEquals("C-001", c.getId());
        assertEquals("CRIMINAL", c.getType());
        assertEquals(150, c.getEstimatedTime());
        assertEquals("PENDING", c.getStatus());
    }

    @Test
    public void testRandomCaseConstructor() {
        Case c = new Case("C-002");

        assertEquals("C-002", c.getId());
        assertNotNull(c.getType());
        assertTrue(c.getEstimatedTime() > 0);
        assertEquals("New", c.getStatus());
    }

    @Test
    public void testToStringFormat() {
        Case c = new Case("C-003", "TRAFFIC", 30, "CLOSED");
        String result = c.toString();

        assertTrue(result.contains("C-003"));
        assertTrue(result.contains("TRAFFIC"));
        assertTrue(result.contains("30"));
        assertTrue(result.contains("CLOSED"));
    }
}
