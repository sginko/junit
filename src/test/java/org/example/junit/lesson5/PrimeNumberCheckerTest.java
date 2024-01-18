package org.example.junit.lesson5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private int inputValue;
    private boolean resultValue;
    private PrimeNumberChecker numberChecker;

    public PrimeNumberCheckerTest(int inputValue, boolean resultValue) {
        this.inputValue = inputValue;
        this.resultValue = resultValue;
    }

    @Before
    public void init() {
        numberChecker = new PrimeNumberChecker();
    }

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized number is = " + inputValue);
        assertEquals(resultValue, numberChecker.validate(inputValue));
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true},
        });
    }

}