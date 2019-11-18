package com_PerScholas_firstexample;

public class ExcControlFlowBasic {

	public static void main(String[] args) {
		
		
		//if block
		
		//Write a program that declares 1 integer variable x, and then assigns 7 to it. 
		//Write an if statement to print out “Less than 10” if x is less than 10. 
		//Change x to equal 15 and notice the result (console should not display anything).
		int x = 5;
		
		if (x < 10) {
			System.out.println("Five is really less than Ten!");
		  x = 15;
		  System.out.println("Print the Value of x :   " + x);
		}
		//if else block
		
		/*Write a program that declares 1 integer variable x, and then assigns 7 to it. 
		Write an if-else statement that prints out “Less than 10” if x is less than 10 and 
		“Greater than 10” if x is greater than 10. Change x to 15 and notice the result.*/
		
		int y = 15;
		if (y > 10) {System.out.println(" y is greater than Ten! : " + y );
			
		}
		else {
			System.out.println("y is really less than Ten!");
		}
		
		//if-else=if block
		
		/*Write a program that declares 1 integer variable x, and then assigns 15 to it. 
		 * Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10, “Between 10 and 20” if x is greater than 10 but less than 20 and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
		 */
 
		int p = 15;
		if (p > 10) {
			System.out.println("The value of p is between 10 and 20");
		} else if (p >= 20) {
			System.out.println("The value of p is greater than 20");
		} else {
			System.out.println("Change the number to 50");
		}
	}
}
