package org.example.junit.lesson4;

import org.junit.Test;

public class TimeoutTest {

    @Test(timeout = 500)
    public void timeout() throws InterruptedException{
        while (true){
            Thread.currentThread().sleep(1000);
        }
    }
}
