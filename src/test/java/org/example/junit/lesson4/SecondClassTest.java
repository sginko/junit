package org.example.junit.lesson4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SecondClassTest {

    @BeforeAll
    static void beforeClass(){
        System.out.println("Before SecondClassTest.class");
    }

    @AfterAll
    static void afterClass(){
        System.out.println("After SecondClassTest.class");
    }

    @Test
    void test(){
        System.out.println("JUNIT");
    }
}
