package com.Perscholas.JavaSBAProject_01;

import java.util.Scanner;

public class SbaQues4 {

	public static void main(String[] args) {
	  
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 4:" );
		 int day = Scan.nextInt();
		
		
	    switch (day) {
	      case 1:
	        System.out.println("Good morning");
	        break;
	      case 2:
	        System.out.println("Good afternoon");
	        break;
	      case 3:
	        System.out.println("Good evening");
	        break;
	      case 4:
	        System.out.println("Good night");
	        break;
	      
	    	}
	  }
	

	}


