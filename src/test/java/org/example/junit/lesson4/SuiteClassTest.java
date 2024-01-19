package org.example.junit.lesson4;

import junitparams.JUnitParamsRunner;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@SelectClasses({SecondClassTest.class, OrderExampleTest.class})
public class SuiteClassTest {
}
