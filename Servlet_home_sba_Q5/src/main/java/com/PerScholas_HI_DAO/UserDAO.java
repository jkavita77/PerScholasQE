package com.PerScholas_HI_DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.PerScholas_HI_Class.User;



public class UserDAO {
	public User getUserByName(String name) throws ClassNotFoundException, IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		User u = null;
		
		// Assign query string to variable
		String qString = "select * from User where FirstName = ?";
		
		// Create MySqlConnection class instance
		DataBaseConnection databaseConnection = new DataBaseConnection();
		// Begin try/catch block to query the database
		try
		{
			// Connect to database and assign query string to PreparedStatement object
			conn = databaseConnection.getConnection();
			System.out.println("Find user by name connection made.");
			stmt = conn.prepareStatement(qString);
			
			// Set query parameters (?)
			stmt.setString(1, name);
			// Run query and assign to ResultSet
			rs = stmt.executeQuery();
			// Retrieve ResultSet and assign to new User
			if (rs.next()) {
				u = new User();
				u.setUserid(rs.getInt(1));
				u.setUFirstname(rs.getString(2)); 
				u.setULastname(rs.getString(3)); 
				u.setEmail(rs.getString(4));
				u.setPassword(rs.getString(5));
				
			}
		}
		catch (ClassNotFoundException | IOException | SQLException e)
		{
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
			//System.out.println(e.getStackTrace());
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
		return u;
	}
	
	public Integer registerUser(User user) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		// Assign insert statement string to variable
		String insertString = "insert into user (firstname, lastname, useremail, userpassword) values (?,?,?,?)";
		
	    int ID = -1;
	    String[] COL = {"userid"};
	    
	    DataBaseConnection databaseConnection = new DataBaseConnection();
	    
	    try
	    {
	        conn = databaseConnection.getConnection();
	        stmt = conn.prepareStatement(insertString, COL);
	        
	        stmt.setString(1, user.getUFirstname());
	        stmt.setString(2, user.getULastname());
	        stmt.setString(3, user.getEmail());
	        stmt.setString(4, user.getPassword());
	       
	        
	        stmt.executeUpdate();
	        
	        rs = stmt.getGeneratedKeys();
	        if(rs != null && rs.next()) {
	            ID = rs.getInt(1);
	        }
	        System.out.println(ID);
	    }
	    catch (SQLException e)
		{
			System.out.println("Error: " + e.getMessage());
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
	    
		return ID;
	} // End of registerMember() method
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		UserDAO u_dao = new UserDAO();
	
		// For selecting a user
		User u = u_dao.getUserByName("Kim");
		System.out.println(u.getUserid());
		System.out.println(u.getULastname());
		System.out.println(u.getPassword());
		
		// For registering a member
				
//				User u1 = new User();		
//				u1.setUserid(2);
//				u1.setUFirstname("Tom");
//				u1.setULastname("Laundry");
//				u1.setEmail("member@gmail.com");
//				u1.setPassword("pass1111");
//				
//				Integer i = u_dao.registerUser(u1);
				
		
	}

}


