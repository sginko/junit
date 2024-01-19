package org.example.junit.lesson2;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccumulatorTest {

    private static int number;
    private Accumulator accumulator;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before class");
        number = 10;
    }

    @AfterAll
    static void afterClass() {
        System.out.println("After class");
    }

    @BeforeEach
    void before() {
        System.out.println("Before method");
        accumulator = new Accumulator();
    }

    @AfterEach
    void after() {
        System.out.println("After method");
    }

    @Test
    void accumulate() {
        System.out.println("Accumulate test");
        accumulator.accumulate(number);
        accumulator.accumulate(number * 2);
        int actual = accumulator.getCounter();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
//    @Disabled("Tested in accumulate method")
    void getCounter() {
        System.out.println("Get counter test");
        accumulator.accumulate(number);
        int actual = accumulator.getCounter();
        int expected = 10;
        assertEquals(expected, actual);
    }
}