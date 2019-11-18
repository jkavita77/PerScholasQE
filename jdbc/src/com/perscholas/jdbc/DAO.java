package com.perscholas.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class DAO {
	
	public  Connection connection = null;
	public Statement stmt = null;
	public ResultSet rs = null;
	public StudentClass u = null;
	public List<StudentClass> stdArr = null;

	
			
	public List<StudentClass> getAllUsers()  {

		// Assign query string to a variable
		String qString = "select * from product";

		try
		{
			// Create Statement instance/object
			stmt = connection.createStatement();
		
			// Run query and assign to the ResultSet instance
			rs = stmt.executeQuery(qString);
			//Create list to hold Product objects
			stdArr = new ArrayList<StudentClass>();
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new StudentClass();
				u.setStudentID(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPrice(rs.getDouble(3));
				// Add the user to the list
				stdArr.add(u);
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
		}
		return stdArr;
	} // End of getAllUsers method	s
	
}
