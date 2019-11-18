package com.Perscholas_Basic_Exercise_Category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SaturdayMorningTests.class)
@Suite.SuiteClasses({CoffeeTests.class, EspressoTests.class, CappuccinoTests.class})
public class SaturdayMorningTestSuite {
	
}

/*  JUnit Output:
 * CoffeeTests.coffeeTest2()
 * CappuccinoTests.cappuccinoTest1()
 * CappuccinoTests.capuuccinoTest2()
 */