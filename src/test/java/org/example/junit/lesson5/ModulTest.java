package org.example.junit.lesson5;

import org.junit.jupiter.api.Test;
import org.junit.experimental.categories.Category;

public class ModulTest {

    @Test
    @Category(FastTest.class)
    void testAccount(){
        System.out.println("Fast testAccount");
    }

    @Test
    @Category({FastTest.class, SlowTest.class})
    void addAccountToDb(){
        System.out.println("Fast and Slow addAccountToDb");
    }
}
