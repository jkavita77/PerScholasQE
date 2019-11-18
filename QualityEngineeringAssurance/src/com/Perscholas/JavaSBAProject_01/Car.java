package com.Perscholas.JavaSBAProject_01;

public class Car {
	int id;
	Double price;
	String description;
	Double invoice;
	Double tax = 0.06;
	int titlefee = 150;
	Double licencefee = 0.015;
	
	public Car(){
		
	}
	
	Car(int id, Double price, String description) {
		this.id = id;
		this.price = price;
		this.description = description;
	}
	
	
	public void Total () {
		this.price= this.price + tax + titlefee + licencefee  ;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	}
	
	