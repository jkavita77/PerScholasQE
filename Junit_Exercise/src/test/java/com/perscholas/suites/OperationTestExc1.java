package com.perscholas.suites;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import com.Perscholas_Excercise1.MathOperations;



public class OperationTestExc1 {

	
	@Test
	public void compareTwoObjectsTest() {
		MathOperations sc = new MathOperations();
		 double actual = sc.addTwoNumbers();
		 double expected = 10.0;
		 System.out.println(actual + ", " + expected);
	     assertThat(actual, equalTo(expected));
		 assertEquals(actual,expected, 0);
		 
		// assertEquals(sc.actual ,expected);
	} 
	@Test
	public void compareTwoObjectsTest1() {
		MathOperations sc = new MathOperations();
		 double actual1 = sc.addTwoNumbers();
		 double expected1 = 11.0;	 
		 assertNotEquals(actual1, expected1, 0);
	}	 
	@Test
	public void compareTwoObjects() {
		MathOperations sc = new MathOperations();
		 double actual1 = sc.subTwoNumbers();
		 double expected1 = 11.0;	 
		 assertNotEquals(actual1, expected1, 0);	 
	}
	
	@Test
	public void testAssertSame() {
		MathOperations sc = new MathOperations();
		 double actual1 = sc.multiTwoNumbers();
		 double expected1 = 9.0;
		 assertEquals(actual1, expected1, 0);
	}	 
		 
	@Test
	public void testAssertNotSame() {
		MathOperations sc = new MathOperations();
		 double actual1 = sc.divideTwoNumbers();
		 double expected1 = 4.0;
		 assertNotSame(actual1, expected1);
		 
	    
}

	@Test
	public void testAssertThat() {
		MathOperations sc = new MathOperations();
		 double actual1 = sc.addTwoNumbers();
		// double expected1 = 4.0;
		 assertThat(actual1, is(10.0));
		 
	    
}
	@Test
	public void testAssertThat1() {
		MathOperations sc = new MathOperations();
		 double actual1 = sc.addTwoNumbers();
		
		 assertThat(actual1, is(not(11)));
}

}