package org.example.junit.lesson4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondClassTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before SecondClassTest.class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After SecondClassTest.class");
    }

    @Test
    public void test(){
        System.out.println("JUNIT");
    }
}
