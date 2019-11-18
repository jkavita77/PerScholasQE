package com.prescholas_junit_intro;

import com.prescholas_junit_intro.*;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SimpleClassTest {

	@Test
	public void returnTrueTest() {
		SimpleClass sc = new SimpleClass();
		assertTrue(sc.returnTrue());
		
	}
}
