package com.PerScholas_Exercise6;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.PerScholas_Exercixe5.User;

import static org.hamcrest.number.OrderingComparison.greaterThan;


@RunWith(Parameterized.class)
public class ParameterisedTest
{
	private static User u;
  
    private Integer userId;
	private String name;
	private String password;
	private double java;
	private double sql;
	private Integer credits;
    int x;
 
   
    public ParameterisedTest(Integer id,String name, String password,double sql,double java,Integer Credits)
    {
        this.name = name;
        this.userId = id;
        this.password = password;
        this.java = java;
        this.sql = sql;
        this.credits = Credits;
    }//ProductDAOParameterisedtest
    
    
    
    @Parameters()
   public static Collection<Object[]> data()
    {
             return Arrays.asList(
                new Object[][] {
                        {1,"John","pass",73,72,1},
                        {2, "Keller","disctinction",75,75,1}
                       
                        });
    } 
    
    @BeforeClass//all the methods in before class should be static
    public static void set()
    {
        u = new User();
    }
    
   
    // Run the test
    @Test
    public void userClassTest()
    {
    	u = new User(userId,name,password, java, sql);
    	Integer cre = u.calculateCredits();
    	System.out.println("credits " + cre);
    
    	assertThat(cre, greaterThan(credits));
    	
  
     } 
	
    
}
	
	
	