package com.PerScholas_HI_Class;

public class Quotes {
 int quoteid;
 int homedi;
 double yearlyPremium;
 int active;
  
 public Quotes() {
	 
 }

public Quotes(int quoteid, int homedi, double yearlyPremium, int active) {
	this.quoteid = quoteid;
	this.homedi = homedi;
	this.yearlyPremium = yearlyPremium;
	this.active = active;
}

public int getQuoteid() {
	return quoteid;
}

public void setQuoteid(int quoteid) {
	this.quoteid = quoteid;
}

public int getHomedi() {
	return homedi;
}

public void setHomedi(int homedi) {
	this.homedi = homedi;
}

public double getYearlyPremium() {
	return yearlyPremium;
}

public void setYearlyPremium(double yearlyPremium) {
	this.yearlyPremium = yearlyPremium;
}

public int getActive() {
	return active;
}

public void setActive(int active) {
	this.active = active;
}
 
}
 