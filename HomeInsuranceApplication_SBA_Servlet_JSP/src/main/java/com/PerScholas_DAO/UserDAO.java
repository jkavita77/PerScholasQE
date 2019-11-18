package com.PerScholas_DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.PerScholas_models.User;



public class UserDAO {
	public Integer registerMember(User User) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Assign insert statement string to variable
		String insertString = "insert into User (firstName, lastname, userEmail, password, userDOB) values (?,?,?,?,?)";

		int ID = -1;
		String[] COL = { "UserId" };

		DataBaseConnection mysql = new DataBaseConnection();

		try {
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(insertString, COL);

			stmt.setString(1, User.getFirstName());
			stmt.setString(2, User.getLastName());
			stmt.setString(3, User.getUserEmail());
			stmt.setString(4, User.getPassword());
			//stmt.setDate(5,  User.getUserDOB());
			
			stmt.executeUpdate();

			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				ID = rs.getInt(1);
			}
			System.out.println(ID);
		} catch (SQLException e) {
			e.printStackTrace();
			//System.out.println("Error: " + e.printStackTrace());
		} finally {
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
	}

	public User getMemberByName(String name) throws ClassNotFoundException, IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		User m = null;
		
		// Assign query string to variable
		String qString = "select * from User where firstname = ?";
		
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
				m = new User();
				m.setUserId(rs.getInt(1));
				m.setFirstName(rs.getString(2));
				m.setLastName(rs.getString(3));
				m.setUserEmail(rs.getString(3));
				m.setPassword(rs.getString(4));
				
				m.setUserDOB(rs.getDate(5));
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
		return m;
	}
	
//	// End of registerMember() method
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		UserDAO m_dao = new UserDAO();

//		// For registering a member
		
//		User m = new User();		
//		m.setUserId(1);
//		m.setFirstName("John");
//		m.setLastName("kom");
//		m.setUserEmail("John@gmail.com");
//		m.setPassword("john1111");
//		m.setUserDOB(01/01/1999);
//		Integer i = m_dao.registerMember(m);
//		
		
		// For selecting a member
		User m = m_dao.getMemberByName("Kim");
		System.out.println(m.getFirstName());
		System.out.println(m.getLastName());
		System.out.println(m.getPassword());
		System.out.println(m.getUserEmail());
		System.out.println(m.getUserDOB());
		
	}



}
