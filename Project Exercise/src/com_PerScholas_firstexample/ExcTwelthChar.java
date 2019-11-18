package com_PerScholas_firstexample;

//Declare a String variable and assign the classic “Hello World!” string to it. Print out the 
//7th character in the string using the charAt() String method. Now use the substring( ) method 
//to print out the 7th character to the end of the string.
public class ExcTwelthChar {
	
		   public static void main(String args[]) {
			String str = "Hello world";
			//This will return the first char of the string
			char ch1 = str.charAt(0);
				
			//This will return the 7th char of the string
			char ch2 = str.charAt(6);
				
			//use of charAt and substring method
				
			System.out.println("Character at 0 index/ 1 Character is: "+ch1);
			System.out.println("Character at 6th index/7th Character is: "+ch2);
			System.out.println("Substring starting from index 6 : " + str.substring(6));
		
		   }
		 
		     }

