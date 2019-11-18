package com_PerScholas_firstexample;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class JavaBasicAge {
	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your year"); //enter the year of dob 
	    int dyear = s.nextInt();
	    System.out.println("Enter your Month"); //enter the month of dob 
	    int dmonth = s.nextInt();
	    System.out.println("Enter your date"); //enter the date of dob 
	    int ddate = s.nextInt();
	    
		
		LocalDate l = LocalDate.of(dyear ,dmonth, ddate ); 
		LocalDate now = LocalDate.now(); //gets localDate
		Period diff = Period.between(l, now); //difference between the dates is calculated
		System.out.println(diff.getYears() + "years " + diff.getMonths() + "months" + diff.getDays() + "days");
		
	}

}
