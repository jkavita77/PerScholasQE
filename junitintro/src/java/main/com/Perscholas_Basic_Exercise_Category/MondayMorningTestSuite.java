package com.Perscholas_Basic_Exercise_Category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({MondayMorningTests.class})
@Suite.SuiteClasses({CoffeeTests.class, EspressoTests.class, CappuccinoTests.class})
public class MondayMorningTestSuite {

}

/* JUnit Output:
 * Coffee.coffeeTest1()
 * Espresso.espressoTest1()
 */