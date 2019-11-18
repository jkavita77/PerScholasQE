package com_PerScholas_firstexample;

//Declare 4 String variables: 1-“Hello”, 2-“Hello”, 3-“World”, 4-“world”. Now use the String equals( ) method to 
//test if string 1 is equal to string 2 and if string 3 is equal to string 4. Now use the equalsIgnoreCase() method 
//to test if string 3 is equal to string 4. Print out the methods and you will 
//get true or false in the console.

public class ExcElevnth {

	public static void main(String[] args) {
		String kk = "Hello";
		String jj = "hello";
		String pp = "World";
		String nn = "world";
		
		if (kk.equals(jj) )
			{ 
			System.out.println("The String Hello is equal, " + "Using Equal Mathod");
			System.out.println(kk + " is equal " + jj);
			}
		else {
			System.out.println("The String Hello is not equal, " + "Using Equal Mathod");
			System.out.println(kk + " (is not equal) " + jj);
			}
		
//using equalsIgnoreCase() method to check the strings are equal
		if (pp.equalsIgnoreCase(nn)) 
			{ 
			System.out.println("The String Hello is equal:  " + "using Equal ignore case Mathod ");
			System.out.println(pp + " = " + nn);
			}
		else {
			System.out.println("The String Hello is not equal ");
			System.out.println(pp + "(is not equal) " +  nn);
			}


// using another way to showcase Equal and EqualIgnorecase
		

//using equalsIgnoreCase() method to check the strings are equal
		String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
        // compare the reference to the memory for object
        System.out.println(s1 == s2); 
        System.out.println(s1.equals(s2)); 
}
}