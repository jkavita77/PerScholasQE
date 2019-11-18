package javaExc2;
import java.util.Scanner;


public class CafeApp {
 public static void main(String[] args)
	   {
	       /*
	        * CafeApp which uses the Scanner class to prompt the user for the quantity of
	        * each product
	        */
	       Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	       Product coffee = new Product("coffee",1.99,"delicious coffee");
	       Product espresso = new Product("espresso",2.99,"delicious espresso");
	       Product cappuccino = new Product("coffee",3.99,"delicious cappuccino");
	       final double SALES_TAX = 0.06;
	       /* prints the name, description and product subtotal for each,
	       followed by the sales subtotal, sales tax and then the final sales total.
	       */
	       System.out.println("How many coffeee drinks woul dyou like ?");
	       coffee.setQuantity(myObj.nextInt());
	       System.out.printf("Name: %s\nDescription: %s\nSubtotal: %2f\n\n", coffee.getName(), coffee.getDescription(),
	              coffee.calculateProductTotal());
	       System.out.println("How many Espresso drinks would you like ?");
	       espresso.setQuantity(myObj.nextInt());
	       System.out.printf("Name: %s\nDescription: %s\nSubtotal: %2f\n\n", espresso.getName(), espresso.getDescription(),
	               espresso.calculateProductTotal());
	       System.out.println("How many cappuccino drinks would you like ?");
	       cappuccino.setQuantity(myObj.nextInt());
	       System.out.printf("Name: %s\nDescription: %s\nSubtotal: %2f\n\n", cappuccino.getName(), cappuccino.getDescription(),
	               cappuccino.calculateProductTotal());
	       double transactionSubtotal = coffee.calculateProductTotal() + espresso.calculateProductTotal() + cappuccino.calculateProductTotal();
	       System.out.println(transactionSubtotal);
	       double transactionTax = transactionSubtotal * SALES_TAX;
	       double total = transactionSubtotal + transactionTax;
	       System.out.printf("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f\n",transactionSubtotal,transactionTax,total);
	       myObj.close();
	   } //main
	} //CafeApp

	


