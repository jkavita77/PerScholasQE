package com_PerScholas_firstexample;

import java.util.Arrays;

public class ExcArrayExamples {

	public static void main(String[] args) {
// Write a program that creates an array of integers with length of
// 3. Assign the values 1, 20 and 30 to to the indexes. Print out each index.

		// Statements for declaring a single array

		int a[] = new int[3];// declaration and instantiation
		a[0] = 1;// initialization
		a[1] = 20;
		a[2] = 30;

		// traversing array
		for (int i = 0; i < a.length; i++)// length is the property of array
			System.out.println(a[i]);

// Write a program that returns the middle element in an array. Give the
// following values
// to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
		int b[] = new int[5];// declaration and instantiation

		b[0] = 13;// initialization
		b[1] = 5;
		b[2] = 7;
		b[3] = 68;
		b[4] = 2;

		int midIndex = (b.length - 1) / 2;
		// traversing array
		System.out.println("midIndex :" + b[midIndex]);
//Write a program that creates an array of String type and initializes it with the strings
//“red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using 
//the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the 
//original array was copied.
		/* This example demonstrates the relationship between the
		 * String join and split methods.*/
		String[] arr1 = {"Red", "Green", "Blue" , "Yellow"};
		int aindex = arr1.length;
		System.out.println("Lenght of the array:  " + aindex);
		// Array elements are joined into a String divided by a delimiter ","
		String j = String.join(",", arr1);
		System.out.println(j);
//To use the Object.clone() method, we have to change a lot of syntaxes to our code, like 
//implementing a Cloneable interface, defining the clone() method and handling
//CloneNotSupportedException, and finally, calling Object.clone() etc.		
		
		//Scenario 3: Copy array using clone
	      String[] e = {"Red", "Green", "Blue" , "Yellow"};    
	      String [] f = e.clone();

	     
	      System.out.print("\n Array e: \n");
	      for (int i = 0; i < e.length; i++) {
	          System.out.print(e[i] + " ");
	       }
	      
	      System.out.print("\n Array f: \n");
	      for (int i = 0; i < f.length; i++) {
	          System.out.print(f[i] + " ");
	  
	    	
	      }
	}}


