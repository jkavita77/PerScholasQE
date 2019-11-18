package com.Perscholas.JavaSBAProject_01;


public class MainCourse {

	public static void main(String[] args) {
	
		//main 
		Course c = new Course();
		c.setCname("Java");    
		c.setCdescription ("QE" ); 
		c.setId(1000);
		
		System.out.println("id :" + c.getId());
		System.out.println("Cname :" + c.getCname());
		System.out.println("Cdescription :" + c.getCdescription());
	}

}
