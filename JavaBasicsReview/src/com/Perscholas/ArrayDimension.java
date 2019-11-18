package com.Perscholas;

import java.util.Scanner;

public class ArrayDimension {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new  int[3][2];
		for (int r=0; r<arr.length; r++ ) {
	}
     for(int c = 0; c<arr[r].length; c++)
     {
    	System.out.println("Enter the Value @ [" + r + ", " + c + "]"); 
    	arr[r][c]= scan.nextInt();
     }

	
	}
	for (int i[]: arr)
		for (int  j : i)
			
}
