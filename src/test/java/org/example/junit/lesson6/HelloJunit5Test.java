package org.example.junit.lesson6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

@DisplayName("Override class name")
public class HelloJunit5Test {

    @Test
    void assertTrueWithLambda(){
        List<String> list = Arrays.asList("ITVDN", "junit");
        assertFalse(list::isEmpty);
        assertTrue(list.contains("junit"));
    }

    @Test
    void groupAssertions(){
        Person person = new Person("Ivan", "Ivanovich");
        assertAll(
                () -> assertEquals("Ivan", person.getFirstName()),
                () -> assertEquals("Ivanovich", person.getLastName())
        );

    }

    @Test
    void baseAssertions(){
        assertEquals("a", "a");
        assertEquals(2, 1 + 1, "Optional message");
        assertEquals(3, 1 + 2, () -> "Lazy evaluation message");

    }

    @Test
    @DisplayName("Test print \uD83D\uDC4D")
    void firsTest(){
        System.out.println("Hello, Junit5!");
    }
}
