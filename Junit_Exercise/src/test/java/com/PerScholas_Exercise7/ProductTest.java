package com.PerScholas_Exercise7;

import org.junit.Test;

import org.junit.experimental.categories.Category;
@Category({TestEnv.class})
public class ProductTest {
 
	@Test
	public void createProductTest() {
		System.out.println("createProductTest");
 }
	@Category({ProductionEnv.class})	
	@Test
	public void restockInventoryTest() {
		System.out.println("restockInventoryTest");
}
}