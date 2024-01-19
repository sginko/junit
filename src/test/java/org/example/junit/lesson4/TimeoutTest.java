package org.example.junit.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeoutTest {

    @Test
    void timeout() {
        Assertions.assertTimeout(Duration.ofMillis(500),
                () -> Thread.currentThread().sleep(400));
    }
}
