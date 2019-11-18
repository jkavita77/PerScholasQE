package com.Perscholas;

import java.util.Scanner;

public class ClassLoop1 {
	

	public static void main(String[] args) {
		int x = 0; 
		String  name;
	
		Scanner s = new Scanner(System.in);
		
		System.out.println( " Enter the name");
			name = s.next();
		
		System.out.println(" Enter the numner ");
			x= s.nextInt();
		
		while (x<=10) {
		System.out.println(" Enter the numner ");
		x= s.nextInt();
		}
		if ( x > 10) {
		System.out.println("print the value of x" + x * 5);
		    }
		}
		
}
	
		
		
		
		
	
