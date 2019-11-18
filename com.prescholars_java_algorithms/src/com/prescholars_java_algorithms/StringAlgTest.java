package com.prescholars_java_algorithms;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringAlgTest {
	@Test
	public void returnArrTest() {
		StringAlg sa = new StringAlg();
		assertTrue(sa.returnWord().length == 3);
		System.out.println("Hello");
		//assertFalse(sa.returnWord()[0].equals("Hello"));
		
	}

}
