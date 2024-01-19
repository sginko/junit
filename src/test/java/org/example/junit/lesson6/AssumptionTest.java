package org.example.junit.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTest {

    @Test
    void testJava8Installed(){
        Assumptions.assumeTrue(System.getProperty("java.version").contains("1.8"));
        System.out.println("Everything fine");
    }

    @Test
    void testJava7Installed(){
        Assumptions.assumeTrue(System.getProperty("java.version").contains("1.7"));
        System.out.println("Need to update");
    }

}
