package com.PerScholas_Capitalized;


	import java.util.*;
	public class CapitalizeAlg {
	     public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
	     System.out.print("Input a Sentence: \n");
		 String line = in.nextLine();
		 String upper_case_line = ""; 
	     Scanner lineScan = new Scanner(line); 
	     while(lineScan.hasNext()) {
	      String word = lineScan.next();
	      System.out.println("word :"+word);
	      System.out.println("word.substring(1) :"+word.substring(1));
	upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
	         }
	      System.out.println(upper_case_line.trim()); 
	    }
	}


