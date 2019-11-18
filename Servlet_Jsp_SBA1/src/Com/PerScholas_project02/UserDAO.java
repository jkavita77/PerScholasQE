package Com.PerScholas_project02;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDAO {
	public User getUserByName(String name) throws ClassNotFoundException, IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		User u = null;
		
		// Assign query string to variable
		String qString = "select * from Users where user_name = ?";
		
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
				u.setUser_id(rs.getInt(1));
				u.setUser_name(rs.getString(2));    
				u.setPassword(rs.getString(3));
				
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
	
	// End of registerMember() method
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		UserDAO u_dao = new UserDAO();

		
		
		// For selecting a member
		User u = u_dao.getUserByName("user1");
		System.out.println(u.getUser_id());
		System.out.println(u.getPassword());
		
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
