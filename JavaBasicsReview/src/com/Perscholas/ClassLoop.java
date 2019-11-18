package com.Perscholas;

import java.util.Scanner;

public class ClassLoop {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner s1 = new Scanner(System.in);
	
		
		System.out.println(" Enter a variable 1 : ");
		a = s1.nextInt();
		System.out.println(" Enter a variable 2 : ");
		b = s1.nextInt();
		
		if (a> b) { 
			System.out.println(a + " is greater than " + b);
		} else
			System.out.println(b + " is greater than " + a);

		s1.close();
		
	}

}
