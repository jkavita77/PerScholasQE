package com.PerScholas_Exercise9;

public class UserDaoParameterizeTest {
	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;



import static org.hamcrest.CoreMatchers.equalTo;
	import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
	import java.util.Collection;

	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.junit.runner.RunWith;

	// Annotate class with @RunWith(Parameterized.class)
	@RunWith(Parameterized.class)
	public class UserDaoParameterizeTest {
		// Declare atttibutes
		private static ProductDaoClass p_dao;
		private String name ;
		private double Price = 0;
		

		/* Create the constructor. The order of arguments in the parentheses
		 * determines the parameter position in the two-dimensional Object arrays.
		 * Parameter1 = argument num1, Parameter2 = argument num2,
		 * Parameter3 = argument testSum, Parameter4 = argument confirmation*/
		public ProductDaoParameterrizedTest(String name, double price) {
			this.name = name;
			this.Price = price;
			
		}

		/* Set up the parameters. The confirmation parameter is null and will
		 * be assigned in the actual test method depending on accuracy of
		 * the addition result. */
		@Parameters()
	    public static Collection<Object[]> data() {
	        return Arrays.asList(
	                new Object[][] {
	                		{ "Phone", 499.0 },
	                		{ "Laptop", 799.0 },
	                		{ "Smart Tv", 699.0},
	                		{ "Tablet", 399.9 }
	                		});
	    }

	    // Create the static class variable additionClass to run the test methods
	    @BeforeClass
	    public static void setUp() {
	    	p_dao = new ProductDaoClass();
	    }

	    // Run the test
	    @Test
	    public void UserDaoParameterizeTest() throws ClassNotFoundException, SQLException, IOException {
	    	Product p = new Product();
	    	p.setName(name);
	    	p.setPrice(Price);
	    	assertNotNull(p_dao.registerProduct(p));
}
