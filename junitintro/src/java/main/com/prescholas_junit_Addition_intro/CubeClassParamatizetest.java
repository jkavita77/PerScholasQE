package com.prescholas_junit_Addition_intro;



	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;
	import static org.hamcrest.CoreMatchers.equalTo;
	import static org.junit.Assert.assertThat;
	import java.util.Arrays;
	import java.util.Collection;
	import org.junit.Test;
	import org.junit.runner.RunWith;

	// Annotate class with @RunWith(Parameterized.class)
	@RunWith(Parameterized.class)
	public class CubeClassParamatizetest {
		// Declare atttibutes
		private static CubeClass cubeClass;
		private Integer l = null;
		private Integer w = null;
		private Integer h = null;
		private Integer vol = 0;
		private Boolean confirmation;

		/* Create the constructor. The order of arguments in the parentheses
		 * determines the parameter position in the two-dimensional Object arrays.*/
		
		public CubeClassParamatizetest(Integer l, Integer w,
				Integer h, Integer vol, Boolean confirmation) {
			this.l = l;
			this.w = w;
			this.h = h;
			this.vol = vol;
			this.confirmation = confirmation;
		}

		/* Set up the parameters. The confirmation parameter is null and will
		 * be assigned in the actual test method depending on accuracy of
		 * the addition result. */
		@Parameters()
	    public static Collection<Object[]> data() {
	        return Arrays.asList(
	                new Object[][] {
	                		{ 2, 3, 4, 24, true },
	                		{ 1, 2, 4, 8, true },
	                		{ 3, 3, 3, 27, true },
	                		{ 4, 4, 3, 15, false }
	                		});
	    }


	    // Run the test
	    @Test
	    public void cubeClassTest() {
	    	cubeClass = new CubeClass(l,w,h);
	    	Integer actual = cubeClass.calculateVolume();
	    
	    	if(actual == vol) {
	    		assertThat(confirmation, equalTo(true));
	    	} else {
	         assertThat(confirmation, equalTo(false));
	    	}

	    	System.out.printf("l: %d + w :%d + h: %d + vol: %d, Result is %s\n",
	    			l, w, h,vol,  Boolean.toString(confirmation));

	    }
	}