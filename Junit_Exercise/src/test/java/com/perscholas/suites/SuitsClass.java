package com.perscholas.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.perscholas_Excercise2.SimpleHamcrestTestClass;


//import com.Perscholas_Excercise1.MathOperations;
//import com.Perscholas_Excercise2.SimpleHamcrestClass;
//import com.Perscholas_Excercise2.SimpleHamcrestClass;


	
	@RunWith(Suite.class)
	@SuiteClasses({ OperationTestExc1.class,
		SimpleHamcrestTestClass.class })

	
	public class SuitsClass {
	}