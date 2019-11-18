package com.PerScholas_App_HW;



import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBActions {
	
	public Connection getConnection() throws Exception {
		final Properties prop = new Properties();
		final InputStream inputStream = DBActions.class.getClassLoader()
				.getResourceAsStream("properties/db.properties");
		prop.load(inputStream);
		Class.forName(prop.getProperty("driver"));
		final Connection connection = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
				prop.getProperty("password"));
		return connection;
	}
	
	  public ArrayList getAllItems() throws Exception {
			// Declare variables
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			Item u = null;
			ArrayList list = new ArrayList();
			
			// Assign query string to variable
			//String qString = "select * from itemtable where name = ?";
//			String qString = "select * from itemtable where item = ? ";
			String qString = "select * from itemtable ";
			
			// Create DatabaseConnection class instance
			DBActions mysql = new DBActions();
			// Begin try/catch block to query the database
			try
			{
				// Connect to database and assign query string to PreparedStatement object
				conn = mysql.getConnection();
				stmt = conn.prepareStatement(qString);
				
				// Set query parameters (?)
//				stmt.setString(1, name); // user_id if from String parameter passed to method
				// Run query and assign to ResultSet
				rs = stmt.executeQuery();
				// Retrieve ResultSet and assign to new Product
				while (rs.next()) {
					u = new Item();
					u.setId(rs.getInt(1));
					u.setName(rs.getString(2));
					u.setPrice(rs.getDouble(3));
					list.add(u);
					
//					System.out.println("u.getId() :"+u.getId());
				}
			}
			catch (ClassNotFoundException | IOException | SQLException e)
			{
				System.out.println("Error: " + e.getMessage());
				System.out.println(e.getStackTrace());
			}
			finally
			{
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
			return list;
		}  
}	