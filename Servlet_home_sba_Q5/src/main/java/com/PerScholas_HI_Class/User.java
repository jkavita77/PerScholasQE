package com.PerScholas_HI_Class;

public class User {
	int userid;
	String UFirstname;
	String ULastname;
	String email;
	String password;
	
	public User() {
		
	}
	
	public User(int userid, String uFirstname, String uLastname, String email, String password) {
		
		this.userid = userid;
		UFirstname = uFirstname;
		ULastname = uLastname;
		this.email = email;
		this.password = password;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUFirstname() {
		return UFirstname;
	}

	public void setUFirstname(String uFirstname) {
		UFirstname = uFirstname;
	}

	public String getULastname() {
		return ULastname;
	}

	public void setULastname(String uLastname) {
		ULastname = uLastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
