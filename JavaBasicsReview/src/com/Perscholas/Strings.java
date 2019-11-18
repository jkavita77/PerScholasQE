package com.Perscholas;

public class Strings {

	public static void main(String[] args) {
		String str =  "Welcome to QE Class";
		String[] arrstr = str.split(" ");
		
		for (int i = 0; i < arrstr.length; i++)
			System.out.println(arrstr[i]);
		
		for (String c : arrstr)
		System.out.println(c);
	}
	
	

}
