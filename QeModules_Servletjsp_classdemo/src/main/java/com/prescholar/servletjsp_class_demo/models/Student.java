package com.prescholar.servletjsp_class_demo.models;
import com.prescholar.servletjsp_class_demo.dao.MariadbConnection;

import java.io.IOException;
import java.sql.*;

public class Student {
	//Attributes/Fields
	
	 private Integer studentId;
	 private String name;
	 private String email;
	 private String hometown;
	 private String courseSelected;
	 
	public Student(Integer studentId, String name, String email, String hometown, String courseSelected) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.hometown = hometown;
		this.courseSelected = courseSelected;
	}
	
	public Student(String name, String email, String hometown, String courseSelected) {
		super();
		this.name = name;
		this.email = email;
		this.hometown = hometown;
		this.courseSelected = courseSelected;
	}

	public Student() {
		
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getCourseSelected() {
		return courseSelected;
	}
	public void setCourseSelected(String courseSelected) {
		this.courseSelected = courseSelected;
	}
	 
}



