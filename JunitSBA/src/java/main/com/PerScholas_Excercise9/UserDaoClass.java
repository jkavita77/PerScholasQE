package com.PerScholas_Excercise9;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDaoClass {

    private Connection conn = null;
    private DatabaseConnection dbc = new DatabaseConnection();
    
    public void testConnection() throws SQLException {
        try {
            conn = dbc.getConnection();
            System.out.println("Connection successful");
        } catch(Exception e) {
            System.out.println("Connection unsuccessful");
        } finally {
            if(conn != null)
                conn.close();
        }
    }
    
    

////****************getAllUsers() method*****************Create

	public List<User> getAllUsers() throws SQLException {
		// Declare variables
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		User u = null;
		List<User> productlist = null;

		// Assign query string to a variable
		String qString = "select * from User";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();

		// Begin try/catch block to query the database
		try
		{
			// Connect to database
			conn = mysql.getConnection();
			// If the connection fails the application won't make it to this point
			System.out.println("Connected to database.");
			// Create Statement instance/object
			stmt = conn.createStatement();
		
			// Run query and assign to the ResultSet instance
			rs = stmt.executeQuery(qString);
			//Create list to hold User objects
			productlist = new ArrayList<User>();
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new User();
				// Assign columns/fields to related fields in the User object
				// 1,2 and 3 represent column numbers/positions
				u.setUserId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setJavaScore(rs.getDouble(4));
				u.setSqlScore(rs.getDouble(5));
				u.setPassword(rs.getString(3));
				// Add the user to the list
				productlist.add(u);
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		}
		catch (ClassNotFoundException | IOException | SQLException e)
		{
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
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
		return productlist;
	} // End of getAllUsers method	
	//****************registerProduct() method*****************insert
	
		public Integer registerUser(User user) throws SQLException, ClassNotFoundException, IOException {
			// Declare variables
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			// Assign insert statement string to variable
			String insertString = "insert into User (name, password,Javascore, sqlscore) values (?,?,?,?)";
			
		    int ID = -1;
		    String[] COL = {"Userid"};
		    
		    DatabaseConnection mysql = new DatabaseConnection();
		    
		    try
		    {
		        conn = mysql.getConnection();
		        stmt = conn.prepareStatement(insertString, COL);
		        
		        stmt.setString(1, user.getName());
		        stmt.setString(2, user.getPassword());
		        stmt.setDouble(3, user.getJavaScore());
		        stmt.setDouble(4, user.getSqlScore());
		        
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
		}// End of registerProduct() method

		//****************updateUser() method*****************update
		
		public Boolean updateUser(User u) throws SQLException, ClassNotFoundException, IOException {
			// Declare variables
			Connection conn = null;
			PreparedStatement stmt = null;
			Integer updateResult = null;
			
			// Assign update string to variable
			String updateString = "update User "
					+ "set name = ?, password = ?"
					+ "where UserId = ?";
			
			// Create DatabaseConnection class instance
			DatabaseConnection mysql = new DatabaseConnection();
			// Begin try/catch block to query the database
			try
			{
				// Connect to database and assign query string to PreparedStatement object
				conn = mysql.getConnection();
				stmt = conn.prepareStatement(updateString);
				
				// Set query parameters (?)
				
				stmt.setString(1, u.getName());
		        stmt.setString(2, u.getPassword());
		       // stmt.setDouble(3, u.getJavaScore());
		      //  stmt.setDouble(4, u.getSqlScore());
		        stmt.setInt(3, u.getUserId());
				// Run query and assign to ResultSet
				updateResult = stmt.executeUpdate();
			}
			catch (ClassNotFoundException | SQLException e)
			{
				System.out.println("Error: " + e.getMessage());
			}
			finally
			{
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
			if (updateResult > 0) {
				return true;
			}
			return false;
		} // End of updateUser() method
		
		//****************removeUser() method (i.e., delete)*****************delete
		
		public Boolean removeUser(int Userid) throws IOException, SQLException {
			// Declare variables
			Connection conn = null;
			PreparedStatement stmt = null;
			Integer updateResult = null;
			
			// Assign delete string to variable
			String deleteString = "delete from User where Userid = ?";
			
			// Create DatabaseConnection class instance
			DatabaseConnection mysql = new DatabaseConnection();
			// Begin try/catch block to query the database
			try
			{
				// Connect to database and assign query string to PreparedStatement object
				conn = mysql.getConnection();
				stmt = conn.prepareStatement(deleteString);
				
				// Set query parameters (?)
				stmt.setInt(1, Userid);
				// Run query and assign to ResultSet
				updateResult = stmt.executeUpdate();
			}
			catch (ClassNotFoundException | SQLException e)
			{
				System.out.println("Error: " + e.getMessage());
			}
			finally
			{
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
			if (updateResult > 0) {
				return true;
			}
			return false;
		} // End of removeUser() method
		
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
    	UserDaoClass pdao = new UserDaoClass();
        pdao.testConnection(); 
        List<User> plist  = pdao.getAllUsers();
        for(User p: plist)
     	   System.out.println(p.getName());
        
        //Insert
//       User p = new User();
//       p.setName("Ryan");
//       p.setPassword("Ryan0000");
//       p.setJavaScore(100.0);
//       p.setSqlScore(80.0);
//       pdao.registerUser(p);
     
       //update 
       User u = new User();
       u.setName("Kavita");
       u.setPassword("kav000");
       u.setUserId(3);
       pdao.updateUser(u);
       //System.out.println(pdao.getUserId);
       
       //delete
       User d = new User();
       d.setUserId(5);
       pdao.removeUser(5);
     //  System.out.println(pdao.getUserId(5));
    }

	}



