package org.example.junit.lesson5;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
//@Categories.IncludeCategory(SlowTest.class)
@Categories.ExcludeCategory(SlowTest.class)
@Suite.SuiteClasses({IntegrationTest.class, ModulTest.class})
public class CategoryTest {
}
