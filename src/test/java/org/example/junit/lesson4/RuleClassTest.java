package org.example.junit.lesson4;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class RuleClassTest {

    private List<String> logs = new ArrayList<>();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public TestName testName = new TestName();

    @Rule
    public Timeout globalTimeout = Timeout.seconds(3);

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Rule
    public Verifier verifier = new Verifier() {
        @Override
        protected void verify() throws Throwable {
            assertFalse("Message log is not empty", logs.isEmpty());
        }
    };

    @Test
    public void givvenNewMessage_whenVerifier_thenMessageLogNotEmpty(){
        logs.add("There is a new message");
    }


    @Test
    public void givenMultipleErrors_whenTestRun_thenCollectorReportsErrors() {
        errorCollector.addError(new Throwable("Firest thing went wrong"));
        errorCollector.addError(new Throwable("Second thing went wrong"));
    }

    @Test
    public void givenLongRunningTest_whenTimeout_thenTestFail() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testName() {
        assertEquals("testName", testName.getMethodName());
    }

    @Test
    public void givenIllegalArgument_whenExeptionThrow_messageCauseMath() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectCause(CoreMatchers.isA(NullPointerException.class));
        expectedException.expectMessage("This is message");

        throw new IllegalArgumentException("This is message", new NullPointerException());
    }

    @Test
    public void givenTempFolderRule_whenFile_thenFileCreated() throws IOException {
        File file = temporaryFolder.newFile("file-test.txt");

        assertTrue("The file should have been created:", file.isFile());
        assertEquals("Temp folder and test file should match", temporaryFolder.getRoot(), file.getParentFile());
    }

}