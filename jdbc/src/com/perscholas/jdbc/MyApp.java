package com.perscholas.jdbc;

import java.util.List;


public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		dao.setConnection();
		List<StudentClass> listStudents = dao.getAllUsers();
	       for(StudentClass std: listStudents)
	    	   System.out.println(std.getName());

	}

}
