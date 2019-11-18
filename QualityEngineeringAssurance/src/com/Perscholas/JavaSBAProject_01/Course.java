package com.Perscholas.JavaSBAProject_01;


public class Course {
	public static void main(String[] args) { 
    	Course c1 = new Course(10, "Java", "QE"); 
        System.out.println(c1); 
	}
	//attributes
	 	int id ;
		String cname;
		String cdescription;
		
	// no arg constructor 
		Course(){
			}
	// Three arg constructor
		Course(int id, String cname, String cdescription){
			this.id = id;
			this.cname = cname;
			this.cdescription = cdescription;
			} 
		
		
	    @Override
	    public String toString() { 
	        return String.format(id + " + i" + cname + " Description :" + cdescription); 
	    } 
	
		
	 //getter and Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCdescription() {
			return cdescription;
		}
		public void setCdescription(String cdescription) {
			this.cdescription = cdescription;
		}
		
		
		    
}

