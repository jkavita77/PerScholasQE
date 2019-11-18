package com_PerScholas_firstexample;
import java.util.Scanner;  // Needed for the Scanner class

//Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
public class ExcScannerExample {

	public static void main(String[] args) {
		
		// Create a Scanner object to read input.
		Scanner s = new Scanner(System.in);
		
		
		 // Get the test score.
		System.out.print("Please enter the score 0 to 100: ");
		
		
		int score = s.nextInt();
		s.close();
		
	 
		 // Calculate the grade.
				if (score >= 90) {
					System.out.println("You made an A");
				} else if (score >= 80) {
					System.out.println("You made a B");
				}else if (score >= 70) {
						System.out.println("You made a C");
				}else if (score >= 60) {
							System.out.println("You made a D");
				} else {
					System.out.println("You made a F or worse");

				}
		}
}


