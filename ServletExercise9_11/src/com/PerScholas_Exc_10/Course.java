package com.PerScholas_Exc_10;

public class Course {
	Integer courseId;
	String name;
	String description;

	public Course(){
	}
	 public Course(Integer Courseid,String name, String description) {
	 }	
		 
		 
	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

