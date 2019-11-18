package com.PerScholas_models;

import java.util.Date;

public class Quote {
private int quoteid;
private int homeid;
private Double yearlyPremium;
private Date StartDate;
private Date expiration;
private int  active;

public Quote() {
	
}
public Quote(int quoteid, int homeid,Double yearlyPremium, Date StartDate, Date expiration,int active){
	 this.quoteid = quoteid;
	 this.homeid = homeid;
	 this.yearlyPremium = yearlyPremium;
	 this.StartDate = StartDate;
	 this.expiration = expiration;
	 this.active = active;
	 
	 }
public Date getStartDate() {
	return StartDate;
}
public void setStartDate(Date startDate) {
	StartDate = startDate;
}
public int getQuoteid() {
	return quoteid;
}

public void setQuoteid(int quoteid) {
	this.quoteid = quoteid;
}

public int getHomeid() {
	return homeid;
}

public void setHomeid(int homeid) {
	this.homeid = homeid;
}

public Double getYearlyPremium() {
	return yearlyPremium;
}

public void setYearlyPremium(Double yearlyPremium) {
	this.yearlyPremium = yearlyPremium;
}

public Date getExpiration() {
	return expiration;
}

public void setExpiration(Date expiration) {
	this.expiration = expiration;
}

public int getActive() {
	return active;
}

public void setActive(int active) {
	this.active = active;
}
}
