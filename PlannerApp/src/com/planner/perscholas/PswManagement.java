package com.planner.perscholas;

import java.sql.Date;

public class PswManagement {
	int pswmanagementID;
	int userID;
	String Category = null;
	Date date = null;
	String username = null;
	String password= null;
	int pin;
	String email = null;
	int phonenumber;
	
	
	public int getPswmanagementID() {
		return pswmanagementID;
	}
	public void setPswmanagementID(int pswmanagementID) {
		this.pswmanagementID = pswmanagementID;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}
