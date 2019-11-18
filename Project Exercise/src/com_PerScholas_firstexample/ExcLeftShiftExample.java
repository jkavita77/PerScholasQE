package com_PerScholas_firstexample;

public class ExcLeftShiftExample {

	public static void main(String[] args) {
	
		int a = 2;
		System.out.println("Binary of " + a + " is : "  + Integer.toBinaryString(a)); 
		
		int c= a << 1; //left shift by one is adding 1 zero to left from 10 to 100 
		System.out.println("Binary of " + c  + " is : "  + Integer.toBinaryString(c)); 
		  
			a = 9;
			System.out.println("Binary of " + a + " is : "  + Integer.toBinaryString(a));  
			c= a << 1;
			System.out.println("Binary of " + c  + " is : "  + Integer.toBinaryString(c));
			
			a = 17;
			System.out.println("Binary of " + a + " is : "  + Integer.toBinaryString(a));  
			c= a << 1;
			System.out.println("Binary of " + c  + " is : "  + Integer.toBinaryString(c)); 
			
			a = 88;
			System.out.println("Binary of " + a + " is : "  + Integer.toBinaryString(a));  
			c= a << 1;
			System.out.println("Binary of " + c  + " is : "  + Integer.toBinaryString(c)); 
	}

}
