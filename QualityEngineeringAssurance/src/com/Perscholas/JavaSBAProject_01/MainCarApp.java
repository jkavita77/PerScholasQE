package com.Perscholas.JavaSBAProject_01;

import java.util.Scanner;

//import com.PerschCarolas.JavaSBAProject_01.Car;

public class MainCarApp {
	public static void main(String[] args) {
		Car car = new Car();
		
		double x;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Price of the Car you want: ");
		 x = Scan.nextInt();
		
		car.setId(1050);
		car.setDescription("Ford"); 
		car.setPrice(x);
		System.out.println("Make :" + car.getId());
		System.out.println("Model :" + car.getDescription());
		System.out.println("YearBuilt :" + car.getPrice());

		car.Total();
		System.out.println("Total price :" + car.getPrice());
	
}

}
