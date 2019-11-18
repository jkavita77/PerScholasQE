package com.perscholas.oop;
public class Car {
	String make;
	String model;
	int yearBuilt;
	double miles = 0;

	Car() {

	}

	Car(int year) {
		this.yearBuilt = year;
	}

	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.yearBuilt = year;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public void driveForward() {
		this.miles = this.miles + 10;
	}

	public void driveReverse() {
		this.miles = this.miles - 10;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	public  void keyWordDemo() {
		System.out.print("Hello from Car");
	}
}