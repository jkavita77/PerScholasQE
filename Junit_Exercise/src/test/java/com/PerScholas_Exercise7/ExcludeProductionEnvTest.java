package com.PerScholas_Exercise7;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(ProductionEnv.class)
@Suite.SuiteClasses({ProductTest.class, ProductTest.class, ShoppingCartTest.class})


public class ExcludeProductionEnvTest {

}
