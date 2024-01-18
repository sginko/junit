package org.example.junit.lesson4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
//@FixMethodOrder
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderExampleTest {

    @AfterClass
    public static void after(){
        System.out.println("After OrderExampleTest.class");
    }

    @BeforeClass
    public static void before(){
        System.out.println("Before OrderExampleTest.class");
    }

    @Test
    public void firstTest() {
        OrderExample.printDatail("firstTest");
    }

    @Test
    public void test() {
        OrderExample.printDatail("test");
    }

    @Test
    public void secondTest() {
        OrderExample.printDatail("secondTest");
    }
}