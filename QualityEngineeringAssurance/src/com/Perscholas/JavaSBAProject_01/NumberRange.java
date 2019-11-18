package com.Perscholas.JavaSBAProject_01;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		int x = 5; 
		int guess = 0;
		int y = 50;
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a number:" );
		guess = scan.nextInt();
		
		
		
		/*while (guess <= x) {
			System.out.println("number is low");
			guess = scan.nextInt();
		}
		else (guess >= y);{
			System.out.println("number is high");*/
			
	
     while(guess <= x ||  guess >= 50) {
		 System.out.println(" Guess the new Number, ur number is out of range: ");
		 x= scan.nextInt();
		}
		if ( guess <= x  ||  guess >= 50) {
			System.out.println("you Guessed the correct number : " + guess );
	
		 }
	}

}
