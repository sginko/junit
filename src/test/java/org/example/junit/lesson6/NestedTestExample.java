package org.example.junit.lesson6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

public class NestedTestExample {

    @Nested
    class CheckAgeOfPerson {

        @ParameterizedTest
        @ArgumentsSource(PersonProvider.class)
        void checkAgeGreaterThan18(Person person) {
            assertTrue(person.getAge() >= 18);
        }
    }

    @Nested
    class CheckNameOfPerson {

        @ParameterizedTest
        @ArgumentsSource(PersonProvider.class)
        void checkFirstNameLenghtMoreThan4(Person person) {
            assertTrue(person.getFirstName().length() >= 4);
        }
    }

    static class PersonProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    new Person("Ivan", "Ivanov", 44),
                    new Person("Andrew", "Ivanov", 18),
                    new Person("Lida", "Ivanov", 23)
                    ).map(Arguments::of);
        }
    }
}
