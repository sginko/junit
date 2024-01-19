package org.example.junit.lesson4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
//@FixMethodOrder
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestMethodOrder(MethodOrderer.Random.class)
public class OrderExampleTest {

    @AfterAll
    static void after(){
        System.out.println("After OrderExampleTest.class");
    }

    @BeforeAll
    static void before(){
        System.out.println("Before OrderExampleTest.class");
    }

    @Test
//    @Order(1)
    void firstTest() {
        OrderExample.printDatail("firstTest");
    }

    @Test
//    @Order(2)
    void test() {
        OrderExample.printDatail("test");
    }

    @Test
//    @Order(3)
    void secondTest() {
        OrderExample.printDatail("secondTest");
    }
}