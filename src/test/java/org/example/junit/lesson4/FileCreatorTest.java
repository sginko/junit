package org.example.junit.lesson4;

import org.assertj.core.api.Assertions.*;
import org.example.junit.lesson3.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.*;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.Assertions.*;

public class FileCreatorTest {

    @org.junit.Test(expected = IOException.class)
    public void testByAnnotationTest() throws IOException {
        FileCreator.createTempFile();
    }

    @org.junit.jupiter.api.Test
    public void testByTryCatch(){
        try {
            FileCreator.createTempFile();
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotEquals("", e.getMessage());
        }
    }

    @Test
    public void testByAssertJ(){
        Throwable throwable = org.assertj.core.api.Assertions.catchThrowable(() -> FileCreator.createTempFile());
        org.assertj.core.api.Assertions.assertThat(throwable).isInstanceOf(IOException.class);
        org.assertj.core.api.Assertions.assertThat(throwable.getMessage()).isNotBlank();
    }

}