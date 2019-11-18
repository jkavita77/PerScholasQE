package com.Perscholas_Basic_Exercise_Category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(WednesdayMorningTests.class)
@Suite.SuiteClasses({CoffeeTests.class, EspressoTests.class, CappuccinoTests.class})
public class ExcludeWednesdayMorningTestSuite {

}

/* JUnit Output:
 * CoffeeTests.coffeeTest2()
 * CappuccinoTests.cappuccinoTest2()
 */