package com.Perscholas;

import java.util.Scanner;

public class ClassEven {

	public static void main(String[] args) {
		int x; 
	
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a number 1 : ");
		x = scan.nextInt();
		if ( x % 2 ==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	scan.close();
	}
	

}
