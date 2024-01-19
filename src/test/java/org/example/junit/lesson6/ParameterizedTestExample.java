package org.example.junit.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

public class ParameterizedTestExample {

    @RepeatedTest(value = 5, name = LONG_DISPLAY_NAME)
    void repitedTest(RepetitionInfo info, TestInfo testInfo){
        System.out.println(info.getCurrentRepetition() + " - " + testInfo.getDisplayName());

    }

    @ParameterizedTest
    @ValueSource(strings = {"junit4", "junit5", "junit3"})
    void testContainsJunit(String example) {
        Assertions.assertTrue(example.contains("junit"));
    }

    @ParameterizedTest
    @EnumSource(value = TimeUnit.class, mode = EnumSource.Mode.EXCLUDE, names = {"DAYS", "MINUTES"})
    void testEnum(TimeUnit timeUnit) {
        System.out.println(timeUnit);
        Assertions.assertNotNull(timeUnit);
    }
}
