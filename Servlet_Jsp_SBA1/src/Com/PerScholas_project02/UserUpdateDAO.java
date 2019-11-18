package Com.PerScholas_project02;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserUpdateDAO {
	//****************updateUser() method*****************
	
	public Boolean updateUser(User u) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;
		
		// Assign update string to variable
		String updateString = "update users "
				+ "set name = ?, password = ? "
				+ "where user_id = ?";
		
		// Create MySqlConnection class instance
		DataBaseConnection mysql = new DataBaseConnection();
		// Begin try/catch block to query the database
		try
		{
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(updateString);
			
			// Set query parameters (?)
			stmt.setString(1, u.getUser_name());
			stmt.setString(2, u.getPassword());
			stmt.setInt(3, u.getUser_id());
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
	

public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	//User m = u_dao.getMemberByName("member1");
	//System.out.println(m.getMemberId());
}
}