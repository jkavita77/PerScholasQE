package com.perscholas.inheritance_abstract;
import java.util.Scanner;


public class CafeAppinhert {
 public static void main(String[] args)
	   {
	  
	 /*
	        * CafeApp which uses the Scanner class to prompt the user for the quantity of
	        * each product
	        */
	      
	       Coffee coffee = new Coffee();
	       Expresso espresso = new Expresso();
	       Cappuccino cappuccino = new Cappuccino();
	       
	       
	       final double SALES_TAX = 0.06;
	      
	       
	       Scanner s = new Scanner(System.in);  // Create a Scanner object
	       System.out.println("How many coffeee drinks woul dyou like ?");
	       coffee.setQuantity(s.nextInt());
	       
	       s.hasNextLine();
	      System.out.println(" Would you like milk ( y or n)?");
	      String milkOption = s.nextLine();
	      if (milkOption.equals("y")) {
	    	  coffee.setMilk(true);
	      }
	      
	      System.out.println(" Would you like sugar ( y or n)?");
	      String sugarOption = s.nextLine();
	      if (sugarOption.equals("y")) {
	    	  coffee.setSugar(true);
	      }
	      
	       System.out.printf("Name: %s\nDescription: %s\nSubtotal: %2f\n\n", coffee.getName(), coffee.getDescription(),
	              coffee.calculateProductTotal());
	       
	      
		    	  
		    	  
	       System.out.println("How many Espresso drinks would you like ?");
	       espresso.setQuantity(s.nextInt());
	       System.out.printf("Name: %s\nDescription: %s\nSubtotal: %2f\n\n", espresso.getName(), espresso.getDescription(),
	               espresso.calculateProductTotal());
	       s.hasNextLine();
		      System.out.println(" Would you like milk ( y or n)?");
		      String extraShot = s.nextLine();
		      if (extraShot.equals("y")) {
		    	  espresso.setExtraShot(true);
		      }
		      
		      System.out.println(" Would you like sugar ( y or n)?");
		      String macchiato = s.nextLine();
		      if (macchiato.equals("y")) {
		    	  espresso.setMacchiato(true);
		      }
	       
	       
	       System.out.println("How many cappuccino drinks would you like ?");
	       cappuccino.setQuantity(s.nextInt());
	       System.out.printf("Name: %s\nDescription: %s\nSubtotal: %2f\n\n", cappuccino.getName(), cappuccino.getDescription(),
	               cappuccino.calculateProductTotal());
	       s.hasNextLine();
		      System.out.println(" Would you like milk ( y or n)?");
		      String peppermint = s.nextLine();
		      if (peppermint.equals("y")) {
		    	  cappuccino.setPeppermint(true);
		      }
		      
		      System.out.println(" Would you like sugar ( y or n)?");
		      String whippedCream = s.nextLine();
		      if (whippedCream.equals("y")) {
		    	  cappuccino.setWhippedCream(true);
		      }
	       
	       
	       double transactionSubtotal = coffee.calculateProductTotal() + espresso.calculateProductTotal() + cappuccino.calculateProductTotal();
	       System.out.println(transactionSubtotal);
	       double transactionTax = transactionSubtotal * SALES_TAX;
	       double total = transactionSubtotal + transactionTax;
	       System.out.printf("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f\n",transactionSubtotal,transactionTax,total);
	       s.close();
	   } //main
	} //CafeApp

}


