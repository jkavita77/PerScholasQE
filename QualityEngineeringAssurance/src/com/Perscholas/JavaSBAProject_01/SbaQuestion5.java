package com.Perscholas.JavaSBAProject_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SbaQuestion5 {

	public static void main(String[] args) {
		
	int x;	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number for a menu:");
	x = s.nextInt();

	System.out.println("............."+ "Menu" +"................");
    ArrayList<String> menu=new ArrayList<String>();  
    menu.add("Cupcake");
    menu.add("ChocolateCake");
    menu.add("Icecream");
    menu.add("Danish Pastry");
    menu.add("Biscuits");
    menu.add("Pie");
    
  //displaying elements
    System.out.println(menu);
    
    //Removing items from menu
    menu.remove(x);
    //displaying elements after removing from menu
    System.out.println("Item removed :   " + menu);
    
  

    //Adding "Chocolate Pie" at the fourth position
    menu.add(x, "Chocolate Pie");

    //displaying elements
    System.out.println("Items added:    " +menu);
   
	}

	}    

