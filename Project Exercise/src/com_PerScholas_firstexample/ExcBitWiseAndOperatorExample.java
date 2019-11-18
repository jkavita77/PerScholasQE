package com_PerScholas_firstexample;

public class ExcBitWiseAndOperatorExample {

	public static void main(String[] args) {
		//BitwiseAnd Operator : &
		
		int x = 7;
		int y = 17;
		int z ;
		
		//First convert the integer  to binary
		System.out.println("Binary of " + x + " is : "  + Integer.toBinaryString(x)); 
		System.out.println("Binary of " + y + " is : "  + Integer.toBinaryString(y)); 
		
		z = x & y; // compares the values bitwise in And operator if 1 1 -> 1 else
		           // 1 0 => 0 , 0 1= > 0 , 0 0 => 0
		System.out.println("Bitwise AND  " + x + " and " + y + " is : "  + Integer.toBinaryString(z)); 
		
		
		z = x | y;// compares the values bitwise in OR operator if 1 1 -> 1 else
        		  // 1 0 => 1 , 0 1= > 1 , 0 0 => 0 . IF one of the combination is one , its 1
		System.out.println("Binary of " + x + " is : "  + Integer.toBinaryString(x)); 
		System.out.println("Binary of " + y + " is : "  + Integer.toBinaryString(y)); 
		System.out.println("Bitwise OR  " + x + " and " + y + " is : "  + Integer.toBinaryString(z)); 
	}

}
