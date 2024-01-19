package org.example.junit.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class NamingTest {
    private Naming naming = new Naming();

    @Test
    void isAdult_AgeLessThan18_False() {
        boolean result = naming.isAdult(17);
        Assertions.assertFalse(result);
    }

    @Test
    void isAdult_False_AgeLessThan18() {
        boolean result = naming.isAdult(17);
        Assertions.assertFalse(result);
    }

    @Test
    void testIsNotAnAdultIfAgeLessThan18() {
        boolean result = naming.isAdult(17);
        Assertions.assertFalse(result);
    }

    @Test
    void isNotAnAdultIfAgeLessThan18() {
        boolean result = naming.isAdult(17);
        Assertions.assertFalse(result);
    }

    @Test
    void should_ReturnFalse_When_AgeLessThan18() {
        boolean result = naming.isAdult(17);
        Assertions.assertFalse(result);
    }

    @Test
    void when_AgeLessThan18_Expect_isAdultAsFalse() {
        boolean result = naming.isAdult(17);
        Assertions.assertFalse(result);
    }

    @Test
    void given_TryToBuyACigarette_When_AgeLessThan18_Expect_IsAdultAsFlse() {
        boolean result = naming.isAdult(17);
        Assertions.assertFalse(result);
    }
}