package com.Perscholas.JavaSBAProject_01;
import java.util.ArrayList;
import java.util.Scanner;
public class NewSbaQuestion5 {

	public static void main(String[] args) {
		 
		  TheMenu();
		  
		  }

		  public static void TheMenu()
		 {
		 
		      String Customer[] = new String[10]; 
		      Scanner input = new Scanner(System.in);

		       String option; 
		       do {   // loop back to here as long as Q isn't selected           
		           System.out.println(".............Menu.............");
		           System.out.println("V: Views all Items");
		           System.out.println("A: To add a item to the list");
		           System.out.println("R: To remove a item from the list");
		           System.out.println("Q: To exit");
		       
		       option = input.next();  
		       
		       if (option.charAt(0) == 'V' ) 
		       		{ 
		           viewAllItem(Customer);
		           } 
		       
		       
		       if (option.charAt(0) == 'A' ) 
		       		{ 
		     	  AddItem(Customer);
		       		}
		       if (option.charAt(0) == 'R' ) 
		       		{ 
		    	   RemoveItem(Customer);
		       		}
		       
		       }
		       while (option.charAt(0) != 'Q');

		       }
		       
		 
		 public static void viewAllItem(String CustomerRef[])
		 {
	ArrayList<String> theItem = new ArrayList<String>();
		 	
			theItem.add("Cake");
			theItem.add("CupCakes");
			theItem.add("Pie");
			theItem.add("Biscuts");
			theItem.add("Icecream");
		 	
		 	 int size = theItem.size();
		 	for (int x = 0; x<size; x++) //for loop for fruits
		 	{            
		 		System.out.println("Item "+ x + " is instock " + theItem);   
		 	}
		 	}
		 
		 public static void AddItem(String CustomerRef[])
		    {

		 Scanner input = new Scanner(System.in);
		 
		ArrayList<String> theItem = new ArrayList<String>();
		 
		 theItem.add("Cake");
		 theItem.add("CupCakes");
		 theItem.add("Pie");
		 theItem.add("Biscuts");
		 theItem.add("Icecream");

		 System.out.println("Enter the Item you'd like to add and EE to exit");
		 String choice = input.next();
		 
		 String EE = "Goodbye!";
//Add a fruit 
		 if (choice !=EE);
		 {
		 	theItem.add(choice);
		 	choice = input.next();
		 	
		 }
		 	    
		 for (String S : theItem)
		 	
		 {
		 	System.out.println(S);
		 }
		 
		 
		 
		 }

		public static void RemoveItem(String CustomerRef[])
		    {

		 Scanner input = new Scanner(System.in);
		 
		ArrayList<String> theItem = new ArrayList<String>();
		 
		theItem.remove("Cake");
		theItem.remove("CupCakes");
		theItem.remove("Pie");
		theItem.remove("Biscuts");
		theItem.remove("Icecream");

		 System.out.println("Enter the fruits you'd like to remove and EE to exit");
		 String choice = input.next();
		 
		 String EE = "Goodbye!";
 
		 if (choice !=EE);
		 {
		 	theItem.remove(choice);
		 	choice = input.next();
		 	
		 }
		 	    
		 for (String S : theItem)
		 	
		 {
		 	System.out.println(S);
		 }

		  

	}

}
