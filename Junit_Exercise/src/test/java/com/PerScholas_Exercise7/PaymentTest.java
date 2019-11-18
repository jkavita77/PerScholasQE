package com.PerScholas_Exercise7;

import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category({TestEnv.class})
public class PaymentTest {
	@Category({ProductionEnv.class})
	@Test
	public void verifyPaymentTest() {
	 System.out.println("verifyPaymentTest");
 }
	@Test
	public void submitPaymentTest() {
		System.out.println("submitPaymentTest");
 }
	
	@Test
	public void confirmPaymentTest() {
		System.out.println("confirmPaymentTest");
 }
}
