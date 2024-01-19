package org.example.junit.lesson6;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestFactoryExample {

    @BeforeEach
    void init() {
        System.out.println("Before method");
    }

    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        List<Person> peoples = Arrays.asList(
                new Person("Ivan", "Ivanov", 33),
                new Person("Jon", "Doe", 18),
                new Person("Oksana", "Ivanivna", 88)
        );
        int minAge = 18;
        return peoples.stream()
                .map(person -> dynamicTest(person.toString(),
                        () -> Assumptions.assumeTrue(person.getAge() >= minAge)))
                .collect(Collectors.toList());
    }

}
