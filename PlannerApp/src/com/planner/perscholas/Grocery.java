package com.planner.perscholas;

import java.sql.Date;

public class Grocery {
	int groceryid;
	int userID;
	String drinks = null;
	Date others = null;
	String fruit = null;
	String produce= null;
	String bakery= null;
	String veggies = null;
	public int getGroceryid() {
		return groceryid;
	}
	public void setGroceryid(int groceryid) {
		this.groceryid = groceryid;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getDrinks() {
		return drinks;
	}
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
	public Date getOthers() {
		return others;
	}
	public void setOthers(Date others) {
		this.others = others;
	}
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getProduce() {
		return produce;
	}
	public void setProduce(String produce) {
		this.produce = produce;
	}
	public String getBakery() {
		return bakery;
	}
	public void setBakery(String bakery) {
		this.bakery = bakery;
	}
	public String getVeggies() {
		return veggies;
	}
	public void setVeggies(String veggies) {
		this.veggies = veggies;
	}
	
	
}
