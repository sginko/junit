package org.example.junit.lesson3;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AssertionTest {

    @Test
    public void whenAssertEquality_thenEqual() {
        String actual = "ITVDN";
        String expected = "ITVDN";
        String message = "Expected and actual not equal";
        assertEquals(message, expected, actual);
    }

    @Test
    public void whenAssertionDoubleEquality_thenEqual() {
        double actual = 0.34;
        double expected = 0.33;
        double delta = 0.009;
        String message = "The difference betwen expected and actual more then delta" + delta;
        assertEquals(message, expected, actual, delta);
    }

    @Test
    public void WhenAssertionArrayEquality_thenEqual() {
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenNullArrays_whenAssertionArraysEquality_thenEqual() {
        int[] actual = null;
        int[] expected = null;

        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenAssertionNull_thenTrue() {
        Object tested = null;
        assertNull("Tested object should be null", tested);
    }

    @Test
    public void whenAssertionNotNull_thenTrue() {
        Object tested = new Object();
        assertNotNull("Tested object should be not ull", tested);
    }

    @Test
    public void whenAssertionNotSameObject_ThenDifferent() {
        Object cat = new Object();
        Object dog = new Object();
        assertNotSame(cat, dog);
    }

    @Test
    public void whenAssertionSameObject_ThenNotDifferent() {
        String actual = "TEST";
        String expected = new String("TEST").intern();
        assertSame(expected, actual);
    }

    @Test
    public void whenAssertionCondition_ThenVerify() {
        assertTrue("5 is greater then 4", 5 > 4);
        assertFalse("5 is not greater then 6", 5 > 6);
    }

    @Test
    public void whenCheckingExceptionMessage_thenEqual() {
        try {
            methodThatShouldThrowException();
            fail("Exeption not throw");
        } catch (UnsupportedOperationException e) {
            String exepted = "Operation not supported";
            assertEquals(exepted, e.getMessage());
        }
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Test
    public void testAssertThatHasItems(){
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
        assertThat(list, CoreMatchers.hasItem("Java"));
    }


}