package com.PerScholas_HI_Class;

public class Home {
 int homeid;
 int userid;
 String address;
 String city;
 String state;
 int zip;
 int  yearbuilt;
 double homevalue;
  
 public Home() {
	  }

public Home(int homeid, int userid, String address, String city, String state, int zip, int yearbuilt,
		double homevalue) {
	this.homeid = homeid;
	this.userid = userid;
	this.address = address;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.yearbuilt = yearbuilt;
	this.homevalue = homevalue;
}

public int getHomeid() {
	return homeid;
}

public void setHomeid(int homeid) {
	this.homeid = homeid;
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public int getZip() {
	return zip;
}

public void setZip(int zip) {
	this.zip = zip;
}

public int getYearbuilt() {
	return yearbuilt;
}

public void setYearbuilt(int yearbuilt) {
	this.yearbuilt = yearbuilt;
}

public double getHomevalue() {
	return homevalue;
}

public void setHomevalue(double homevalue) {
	this.homevalue = homevalue;
}
 
 }
