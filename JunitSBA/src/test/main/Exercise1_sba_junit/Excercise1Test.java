package Exercise1_sba_junit;



import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Excercise1Test {

	@Test
	  public void twoStringsTest() {
	    String str1 = "Per Scholas - 211 N Ervay St. #700 - Dallas, TX 75201";
	    String str2 = "Per Scholas - 211 N Ervay St. #700 - Dallas, TX 75201";
	    String str3 =  str1;
	    assertEquals(str1,str2);
	    assertSame(str1, str3);
	    assertTrue(str1.equals(str2));
	} 
	
	@Test
	  public void Lengthtest() {
	    String str1 = "Per Scholas - 211 N Ervay St. #700 - Dallas, TX 75201";
	    int actual = str1.length();
	   // System.out.println(actual);
	    int expected = 53;
	    assertThat(actual, equalTo(expected));
	    assertNotEquals(actual, equalTo(expected));
	    assertThat(expected, is(notNullValue() ) );
}
	
	@Test
	  public void containsTest() {
	    String str1 = "Per Scholas - 211 N Ervay St. #700 - Dallas, TX 75201";
	   	assertTrue(str1.contains("Scholas"));
	 	}
	@Test
	  public void IgnoreCaseTest() {
	    String str1 = "Per Scholas - 211 N Ervay St. #700 - Dallas, TX 75201";
	    String str2 = "PER SCHOLAS - 211 N ERVAY St. #700 - Dallas, TX 75201";
	   Boolean str = str2.equalsIgnoreCase(str1);
	    System.out.println(str2.equalsIgnoreCase(str1));
	 
	  
	  assertThat(str, is(notNullValue())) ;
	  
	 	}
}