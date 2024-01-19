package org.example.junit.lesson1;

import org.example.junit.lesson3.Assertion;
import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}