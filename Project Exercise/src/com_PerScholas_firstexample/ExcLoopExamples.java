package com_PerScholas_firstexample;

public class ExcLoopExamples {

	public static void main(String[] args) {
		
		
		// loop syntax
		
		//Write a program that uses a for-loop to loop through the numbers 1-10 and 
		//prints out each number.
		System.out.print("For Loop _______________ \n");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		// While loop
		
		//Write a program that uses a while-loop to loop through the numbers 
		//0-100 in increments of 10 and prints out each number.
		System.out.print(" \n While Loop _______________ \n");
		int count = 10;
		while (count <= 100) { // comparing till 100
			System.out.print(count);
			count = count + 10; // incrementing by 10
		}

		// do while loop
		//Write a program that uses a do-while-loop to loop through 
		//the numbers 1-10 and prints out each number.
		System.out.print(" \n Do While Loop _______________ \n");		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		// If k is in between 25 and 75, do nothing, else print
		//Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, but do not print out any 
		//numbers between 25 and 75. Use the “continue” statement to accomplish this.
		
		System.out.print("\n Contiue Loop _______________ \n");
		for (int k = 0; k < 100; k += 5) {
				if (k > 25 && k < 75) {
					continue;
				} else
					System.out.println(k);

		}

		// for-loop to loop using break
			for (int n = 0; n < 100; n += 5) {
				if (n == 50) {
					break;
				}
				System.out.println(n);
	}
			//nested for-loops
			
			for (int t = 1; t < 3; t++) {
				System.out.println("Week: " + t);
				for (int r = 0; r < 6; r++) {
					
					System.out.println("Day: " + r);
				}
}
			}
}