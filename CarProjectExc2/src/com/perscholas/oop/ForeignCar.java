package com.perscholas.oop;

public class ForeignCar extends Car {
	ForeignCar() {
		super();
	}

	ForeignCar(String make, String model, int year) {
		super(make, model, year);

	}

	ForeignCar(int yearBuilt) {
		super(yearBuilt);
	}

	public void keyWordDemo() {
		System.out.print("Hello from Foreign Car");
	}
}
