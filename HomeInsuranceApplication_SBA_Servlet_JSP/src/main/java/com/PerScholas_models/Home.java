package com.PerScholas_models;


	import java.util.Date;
	public class Home {
	    
	    private int homeId;
	    private int userId;
	    private String address1;
	    private String address2;
	    private String state;
	    private String city;
	    private String zip;
	    private Date yearBuilt;
	    private Double homeValue;
	    
	    public Home()
	    {
	      
	    }
	    public Home(int homeId,int userId,String address1,String address2,String state,String city,String zip,Date yearBuilt,Double homeValue)
	    {
	        this.homeId = homeId;
	        this.userId = userId;
	        this.address1 = address1;
	        this.address2 = address2;
	        this.state = state;
	        this.city = city;
	        this.zip = zip;
	        this.yearBuilt = yearBuilt;
	        this.homeValue = homeValue;
	    }
	    public int getHomeId() {
	        return homeId;
	    }
	    public void setHomeId(int homeId) {
	        this.homeId = homeId;
	    }
	    public int getUserId() {
	        return userId;
	    }
	    public void setUserId(int userId) {
	        this.userId = userId;
	    }
	    public String getAddress1() {
	        return address1;
	    }
	    public void setAddress1(String address1) {
	        this.address1 = address1;
	    }
	    public String getAddress2() {
	        return address2;
	    }
	    public void setAddress2(String address2) {
	        this.address2 = address2;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getZip() {
	        return zip;
	    }
	    public void setZip(String zip) {
	        this.zip = zip;
	    }
	    public Date getYearBuilt() {
	        return yearBuilt;
	    }
	    public void setYearBuilt(Date yearBuilt) {
	        this.yearBuilt = yearBuilt;
	    }
	    public Double getHomeValue() {
	        return homeValue;
	    }
	    public void setHomeValue(Double homeValue) {
	        this.homeValue = homeValue;
	    }
	    
	    
}
