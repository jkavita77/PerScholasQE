package com.Perscholas.JavaSBAProject_01;

import java.util.Scanner;

public class ClassInputOutput {

	public static void main(String[] args) {
		
		int x =0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number:" );	//request to input the number
		x = Scan.nextInt();
		System.out.println("Output is :" + x );
	}

}
