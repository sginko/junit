package org.example.junit.lesson2;

import org.junit.*;

import static org.junit.Assert.*;

public class AccumulatorTest {

    private static int number;
    private Accumulator accumulator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
        number = 10;
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void before() {
        System.out.println("Before method");
        accumulator = new Accumulator();
    }

    @After
    public void after() {
        System.out.println("After method");
    }

    @Test
    public void accumulate() {
        System.out.println("Accumulate test");
        accumulator.accumulate(number);
        accumulator.accumulate(number * 2);
        int actual = accumulator.getCounter();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
//    @Ignore("Tested in accumulate method")
    public void getCounter() {
        System.out.println("Get counter test");
        accumulator.accumulate(number);
        int actual = accumulator.getCounter();
        int expected = 10;
        assertEquals(expected, actual);
    }
}