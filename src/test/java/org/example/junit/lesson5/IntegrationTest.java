package org.example.junit.lesson5;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTest.class)
public class IntegrationTest {

    @Test
    public void accountIntegration(){
        System.out.println("Slow test accountIntegration");
    }

    @Test
    public void dbIntegration(){
        System.out.println("Slow test dbIntegration");
    }
}
