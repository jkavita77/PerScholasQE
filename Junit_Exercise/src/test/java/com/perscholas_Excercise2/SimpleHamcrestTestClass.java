package com.perscholas_Excercise2;
import org.hamcrest.Description;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
//import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
//import static org.hamcrest.core.Every.everyItem;

import java.util.Arrays;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import com.Perscholas_Excercise2.SimpleHamcrestClass;

public class SimpleHamcrestTestClass {
	
	@Test
	public void addTwonumbersTest() {
		SimpleHamcrestClass sc = new SimpleHamcrestClass();
		double d = sc.addTwoNumbers(7.0, 1.0);
		double expected = 8.0;
		assertThat(d, is(expected));
	}	
		@Test
		public void SubTwoNumbers() {
			SimpleHamcrestClass sc = new SimpleHamcrestClass();
			double d = sc.SubTwoNumbers(7.0, 1.0);
			double expected = 7.0;
			assertThat(d, is(not(expected)));
	}
		
		@Test
		public void TwoNumberclose() {
			SimpleHamcrestClass sc = new SimpleHamcrestClass();
			double d = sc.AverageTwoNumbers(7.0, 11.0);
			double expected = 9.5;
			assertThat(d, is(closeTo(expected, 0.5)) );
			// assertThat(actual, not(closeTo(operand, error)));
	}
		@Test
		public void TwoNumberNotClose() {
			SimpleHamcrestClass sc = new SimpleHamcrestClass();
			double d = sc.AverageTwoNumbers(7.0, 11.0);
			double expected = 10.0;
			assertThat(d, not(closeTo(expected, 0.5)) );
			// assertThat(actual, not(closeTo(operand, error)));
	}
	
//		****************************************
//		************************************
//		**********List***************************
		    @Test
		    public void hasSizeOf() {
		        List<Integer> list = Arrays.asList(5, 2, 4);

		        assertThat(list, hasSize(3));
		    }
		    //***************Contains Number in any order***************
		   
	    @Test
		    public void containsNumbersInAnyOrder() {
		        List<Integer> list = Arrays.asList(5, 2, 4);
		        assertThat(list, containsInAnyOrder(2, 4, 5));
	    }
}
//	//********************Contains*****************	    
//		    @Test
//		    public void containsNumbers() {
//		        List<Integer> list = Arrays.asList(5, 2, 4);
//		        assertThat(list, contains(5, 2, 4));
//		    }  
////******************EveryItem*****************************
//		   @Test
//		    public void EveryItem() {
//		        List<Integer> list = Arrays.asList(5, 2, 4);
//		        assertThat(list, everyItem(greaterThan(1)));
//		   }
//// ***********************************************************************************	
//// ***********************************************************************************
//// Collection Matchers - Hashmap
//		   @Test
//		   public void whenCompareTwoHashMapsUsingEquals_thenSuccess() {
//		       Map<String, String> asiaCapital1 = new HashMap<String, String>();
//		       asiaCapital1.put("Japan", "Tokyo");
//		       asiaCapital1.put("South Korea", "Seoul");
//		       
//		       Map<String, String> asiaCapital2 = new HashMap<String, String>();
//		       asiaCapital2.put("South Korea", "Seoul");
//		       asiaCapital2.put("Japan", "Tokyo");
//		       
//		       assertTrue(asiaCapital1.equals(asiaCapital2));
//		   }
//		   
//}
//
//		
//
