package com.Perscholas;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		;
		Scanner s = new Scanner(System.in);
		
		int a, b;
		System.out.println(" Enter a variable 1 : ");
		a=s.nextInt();
		System.out.println(" Enter a variable 2 : ");
		b=s.nextInt();
	
		s.close();
		
	System.out.println( "add= "+ (a+b));
	System.out.println("Sub = " + (b-a));
	System.out.println(" Multi = "+ (b/a));
	System.out.println( "Divide = "+(b*a));
	}

}
