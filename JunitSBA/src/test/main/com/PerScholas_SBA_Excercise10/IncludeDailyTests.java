package com.PerScholas_SBA_Excercise10;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(Weekly.class)
@Suite.SuiteClasses({SchoolTests.class, StudentTests.class, InstructorTests.class})
public class IncludeDailyTests {

}


