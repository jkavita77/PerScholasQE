package com_PerScholas_firstexample;

public class ExcRightShiftExample {

	public static void main(String[] args) {
		
		int a = 150; 
		System.out.println("Binary of " + a + " is : "  + Integer.toBinaryString(a)); 
		int c= a >> 2; //Right shift Indicates the bits are to be shifted to the right.removes 2 vales from right
		System.out.println("Binary of " + c  + " is : "  + Integer.toBinaryString(c)); 
		  
			a = 225;
			System.out.println("Binary of " + a + " is : "  + Integer.toBinaryString(a));  
			c= a >> 2; //11100001
			System.out.println("Binary of " + c  + " is : "  + Integer.toBinaryString(c));
			
			a = 1555;
			System.out.println("Binary of " + a + " is : "  + Integer.toBinaryString(a));  
			c= a>> 2;
			System.out.println("Binary of " + c  + " is : "  + Integer.toBinaryString(c)); 
			
			
			
	}

}
