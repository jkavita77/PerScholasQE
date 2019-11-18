package com.PerScholas.Excercise3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.PerScholas_Excercise3.StringClass;

public class StringClassTest {
	@Test
	public void DecimalMethod()
	{
		StringClass sc = new StringClass();
		String actual = sc.ConvertNumbers();
		String expected = "1000";
		assertThat(actual, is(expected));
	}
	
	
}