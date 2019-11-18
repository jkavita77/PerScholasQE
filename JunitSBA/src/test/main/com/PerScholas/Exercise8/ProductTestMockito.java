package com.PerScholas.Exercise8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import com.PerScholas.Excercise8.Product;


public class ProductTestMockito {
 private static Product mockProduct ;

 @BeforeClass
	public static void setUp() {
	 mockProduct = Mockito.mock(
			 Product.class,
		  	      Mockito.CALLS_REAL_METHODS);
	}
 @Test
	public void setSqlScoreValid( ) {
	 mockProduct.setProductId(75);
	}
 @Test
 public void setname()  {
     mockProduct.setName("John");
 }
}
