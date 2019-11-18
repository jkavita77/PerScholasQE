package com.PerScholas_Exercise7;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ProductTest.class,
		PaymentTest.class,
		ShoppingCartTest.class })
public class RunAllClass {

}
