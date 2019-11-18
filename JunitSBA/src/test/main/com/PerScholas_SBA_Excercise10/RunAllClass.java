package com.PerScholas_SBA_Excercise10;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ SchoolTests.class,
	StudentTests.class,
	InstructorTests.class })
public class RunAllClass {

}
