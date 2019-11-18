package com_PerScholas_firstexample;

public class ExcEightPractice {

	public static void main(String[] args) {
	
			
				String Kavita = "hello world!";
				String Joshi = "HELLO WORLD!";

				System.out.println(Kavita.toUpperCase());
				System.out.println(Joshi.toLowerCase());
				System.out.println(Kavita.contains("lo wor")); // true
				System.out.println(Kavita.contains("LO WOR")); // false
				System.out.println(Kavita.toUpperCase().contains("LO WOR")); // true
				System.out.println(Kavita.equals(Joshi)); // false
				System.out.println(Kavita.equalsIgnoreCase(Joshi)); // true
		
	}

}
