package com.prescholas_junit_basic_execrcise_Suits;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestClassTwo {
@Test
	public void methodOne() {
	assertTrue("string".contentEquals("string"));
	System.out.println("TestClassOne methodOne");
}
}
