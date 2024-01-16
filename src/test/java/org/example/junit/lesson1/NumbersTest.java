package org.example.junit.lesson1;

import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 14;
        assertEquals(expected, actual);
    }
}