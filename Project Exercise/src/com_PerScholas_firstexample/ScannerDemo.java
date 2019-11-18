package com_PerScholas_firstexample;

import java.util.Scanner;

public class ScannerDemo {

	// public static void main(String[] args) {
	// Declare an object and initialize with
	// predefined standard input object
	

	// It is necessary to create an object of type Scanner and then an argument of
	// object System.in to the Scanner constructor
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Initialize sum and count of input elements
		int sum = 0,  hi = 0;

		// Check if an int value is available
		while (sc.hasNextInt()) {
			// Read an int value 1
			int num = sc.nextInt();
			sum += num;
			System.out.println(sum);
		}

		System.out.println("Sum: " + hi);
		sc.close(); // End of program
	}
}