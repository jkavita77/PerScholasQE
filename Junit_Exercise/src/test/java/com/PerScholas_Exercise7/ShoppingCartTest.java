package com.PerScholas_Exercise7;

import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category({TestEnv.class})
public class ShoppingCartTest {
	@Test
	public void addProductTest() {
		System.out.println("addProductTest");
 }
	@Test
	public void removeProductTest() {
		System.out.println("removeProductTest");
 }
	@Category({ProductionEnv.class})
	@Test
	public void checkTimeOutTest() {
		System.out.println("checkTimeOutTest");
 }
}
