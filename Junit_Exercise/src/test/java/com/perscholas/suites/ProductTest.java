package com.perscholas.suites;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com_PerScholas_Exercise4.InsufficientQuantityException;
import com_PerScholas_Exercise4.MaximumQuantityExceededException;
import com_PerScholas_Exercise4.Product;


public class ProductTest {
    
    public static Product testObject;
    
    //Sets up the test object used in the tests
    @BeforeClass
    public static void setUpObject() {
        
        testObject = new Product();
        
    }
    
    //This test expects an exception from the specified class
    @Test(expected = InsufficientQuantityException.class)
    public void testInsufficientException() throws InsufficientQuantityException {
        
        //Throws exception just to see if test works
        //Actual code that throws an exception would go here!
            
        testObject.reduceAvailableQuantity(100);
        
        
        
    }
    
    //Sets up an ExpectedException object that is empty for now
    @Rule
    public ExpectedException ee = ExpectedException.none();
    
    @Test
    public void testMaximumQuantityException() throws MaximumQuantityExceededException {
        
        //Fills the ExpectedException object with an actual exception expected
        //The exception object will expect an exception of this type in the upcoming code
        ee.expect(MaximumQuantityExceededException.class);
        
        
        
        //Code should throw the specified exception thus causing the test to succeed
        testObject.setAvailableQuantity(1000);
        
    }
    
    
    
    
}
