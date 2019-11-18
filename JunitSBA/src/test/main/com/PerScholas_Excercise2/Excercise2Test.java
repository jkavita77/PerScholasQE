package com.PerScholas_Excercise2;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class Excercise2Test{
	 @Test
	    public void splitMethod()
	    {
	        
	        String teststring  = "Per Scholas - 211 N Ervay St. #700 - Dallas, TX 75201";
	        
	        String[] parts = teststring.split("-");
	        List<String> splitval = new ArrayList<String>();
	        for (int i = 0;i<parts.length;i++)
	            splitval.add(parts[i]);
	        System.out.println(splitval);
	        
	        //assertThat(SplitandJoinMethod.splitval(), hasItems("211 N Ervay St. #700" ));
	        assertThat(splitval, hasItems(" 211 N Ervay St. #700 "));
	    }
	//join(delim, array). 
	 @Test
	   public void testJoin() {
	    String h1 = "Per Scholas - 211 N Ervay St. #700 - Dallas, TX 75201";
	    String result = String.join(",","Address- ",h1);
	    System.out.println(result);
	    assertThat(result,startsWith("Address- "));
	   }
}