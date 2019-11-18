package com.PerScholas.Exercise4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.PerScholas.Excercise3.StringClassTest;
import com.PerScholas_Excercise2.Excercise2Test;

import Exercise1_sba_junit.Excercise1Test;

@RunWith(Suite.class)
	@SuiteClasses({ Excercise1Test.class,
		Excercise2Test.class,
		StringClassTest.class })

public class TestSuite {

	}

