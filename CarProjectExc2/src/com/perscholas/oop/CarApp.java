package com.perscholas.oop;

public class CarApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** via default constructor with no argument and 
		 then calling setter methods to set the values **/
		
		Car car = new Car();

		car.setMake("Ford");
		car.setModel("Mustang");
		car.setYearBuilt(2016);

		System.out.println("Make :" + car.getMake());
		System.out.println("Model :" + car.getModel());
		System.out.println("YearBuilt :" + car.getYearBuilt());

		car.driveForward();
		car.driveForward();

		System.out.println("Miles :" + car.getMiles());

		car.driveReverse();

		System.out.println("Miles :" + car.getMiles());

		/**via new constructor that accept three arguments and 
		 * setter method for value setting is not used
		 */
		
		car = new Car("Ford", "Mustang", 2017);
		System.out.println("Make :" + car.getMake());
		System.out.println("Model :" + car.getModel());
		System.out.println("YearBuilt :" + car.getYearBuilt());
		
		/**
		 * via new constructor that accept one argument
		 */
		
		car = new Car(2018);
		System.out.println("YearBuilt :" + car.getYearBuilt());

		System.out.println("-------------------------------------------");
		ForeignCar fCar  = new ForeignCar();
		fCar.setMake("Ford");
		fCar.setModel("Mustang");
		fCar.setYearBuilt(2016);

		System.out.println("Make :" + fCar.getMake());
		System.out.println("Model :" + fCar.getModel());
		System.out.println("YearBuilt :" + fCar.getYearBuilt());
		
		fCar.driveForward();
		fCar.driveForward();

		System.out.println("Miles :" + fCar.getMiles());

		fCar.driveReverse();

		System.out.println("Miles :" + fCar.getMiles());
		
		fCar.keyWordDemo();
	}

}
