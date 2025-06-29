package com.example.JUnitTestingDemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);           // Equal
        assertTrue(5 > 3);                // True
        assertFalse(5 < 3);               // False
        assertNull(null);                // Null
        assertNotNull(new Object());      // Not Null
    }
}