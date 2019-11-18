package com.planner.perscholas;

import java.sql.Date;

public class Expense {
	int ExpenseID;
	int userID;
	String Category = null;
	Date date = null;
	String items = null;
	String brand= null;
	String store= null;
	Double price = null;
	Double total = null;
	public int getExpenseID() {
		return ExpenseID;
	}
	public void setExpenseID(int expenseID) {
		ExpenseID = expenseID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
}
