package com.platform;


import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ProductTest {
	static Product product;
	private 
	

	@BeforeClass
	public static void setup(){
		product = new Product();
	}
	@Test(expected = MaximumQuantityExceededException.class)
	public void maximumQuantityExceededException() throws IllegalArgumentException, com.platform.MaximumQuantityExceededException {
		product.setAvailableQuantity(501);
	}
	
	@Test(expected = InsufficientQuantityException.class)
	public void insufficientQuantityException() throws InsufficientQuantityException{
	product.reduceAvailableQuantity(26);
}
}
