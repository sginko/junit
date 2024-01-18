package org.example.junit.lesson4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SecondClassTest.class, OrderExampleTest.class})
public class SuiteClassTest {
}
