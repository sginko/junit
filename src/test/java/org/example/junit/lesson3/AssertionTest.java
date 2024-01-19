package org.example.junit.lesson3;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {

    @Test
    void whenAssertEquality_thenEqual() {
        String actual = "ITVDN";
        String expected = "ITVDN";
        String message = "Expected and actual not equal";
        assertEquals(expected, actual, message);
    }

    @Test
    void whenAssertionDoubleEquality_thenEqual() {
        double actual = 0.34;
        double expected = 0.33;
        double delta = 0.02;
        String message = "The difference betwen expected and actual more then delta" + delta;
        assertEquals(expected, actual, delta, message);
    }

    @Test
    void WhenAssertionArrayEquality_thenEqual() {
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();
        assertEquals(expected, actual);
    }

    @Test
    void givenNullArrays_whenAssertionArraysEquality_thenEqual() {
        int[] actual = null;
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenAssertionNull_thenTrue() {
        Object tested = null;
        assertNull(tested, "Tested object should be null");
    }

    @Test
    void whenAssertionNotNull_thenTrue() {
        Object tested = new Object();
        assertNotNull(tested, "Tested object should be not ull");
    }

    @Test
    void whenAssertionNotSameObject_ThenDifferent() {
        Object cat = new Object();
        Object dog = new Object();
        assertNotSame(cat, dog);
    }

    @Test
    void whenAssertionSameObject_ThenNotDifferent() {
        String actual = "TEST";
        String expected = new String("TEST").intern();
        assertSame(expected, actual);
    }

    @Test
    void whenAssertionCondition_ThenVerify() {
        String assertTrueMessage = "5 is greater then 4";
        assertTrue(5 > 4, assertTrueMessage);
        String assertFalseMessage = "5 is not greater then 6";
        assertFalse(5 > 6, assertFalseMessage);
    }

    @Test
    void whenCheckingExceptionMessage_thenEqual() {
        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class,
                this::methodThatShouldThrowException, "Exception not throw");
        String excepted = "Operation not supported";
        assertEquals(excepted, exception.getMessage());
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Test
    void testAssertThatHasItems() {
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        MatcherAssert.assertThat(list, CoreMatchers.hasItem("Java"));
    }
}
