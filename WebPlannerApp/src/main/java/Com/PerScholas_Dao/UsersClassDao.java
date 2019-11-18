package Com.PerScholas_Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Com.PerScholars_DatabaseConnection.DatabaseConnection;
import Com.PerScholars_JavaClassModels.UsersClass;

public class UsersClassDao {

	private Connection conn = null;
	private DatabaseConnection dbc = new DatabaseConnection();

	public Connection testConnection() {
		try {
			conn = dbc.getConnection();
			return conn;
		} catch (Exception e) {
			System.out.println("Connection unsuccessful");
			return null;
		} finally {
			if (conn != null) {

				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}//// ****************getAllUsers() method*****************Create

	public List<UsersClass> getAllUsers() throws SQLException {
		// Declare variables
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		UsersClass u = null;
		List<UsersClass> Userlist = null;

		// Assign query string to a variable
		String qString = "select * from users";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();

		// Begin try/catch block to query the database
		try {
			// Connect to database
			conn = mysql.getConnection();
			// If the connection fails the application won't make it to this point
			// Create Statement instance/object
			stmt = conn.createStatement();

			// Run query and assign to the ResultSet instance
			rs = stmt.executeQuery(qString);
			// Create list to hold Users objects
			Userlist = new ArrayList<UsersClass>();
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new UsersClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setUserid(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRole(rs.getInt(4));
				// Add the user to the list
				Userlist.add(u);
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
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
		return Userlist;
	} // End of getAllUsers method

	// Get user by specific ID
	public UsersClass getUsersByID(int ID) throws Exception {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		UsersClass u = null;

		// Assign query string to a variable
		String qString = "select * from Users where Userid = " + ID;

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();

		// Begin try/catch block to query the database
		try {
			// Connect to database
			conn = mysql.getConnection();
			// If the connection fails the application won't make it to this point
			// Create Statement instance/object
			stmt = conn.prepareStatement(qString);
			// Run query and assign to the ResultSet instance
			rs = stmt.executeQuery(qString);
			// Create list to hold Users objects
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new UsersClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setUserid(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRole(rs.getInt(4));
				// Add the user to the list
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
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

		return u;

	} // End of getAllUsers method

	// ****************registerProduct() method*****************insert

	public UsersClass getUsersByName(String  userName) throws Exception {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		UsersClass u = null;

		// Assign query string to a variable
		String qString = "select * from Users where username = " + "'"+ userName +"'";
		System.out.println("qString :"+qString);

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();

		// Begin try/catch block to query the database
		try {
			// Connect to database
			conn = mysql.getConnection();
			// If the connection fails the application won't make it to this point
			// Create Statement instance/object
			stmt = conn.prepareStatement(qString);
			// Run query and assign to the ResultSet instance
			rs = stmt.executeQuery(qString);
			// Create list to hold Users objects
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new UsersClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setUserid(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRole(rs.getInt(4));
				// Add the user to the list
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
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

		return u;

	} // End of getAllUsers method


	public Integer registerUser(UsersClass user) {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Assign insert statement string to variable
		String insertString = "insert into Users (userid, username, password, role, email) values (?,?,?,?,?)";

		int ID = -1;
		String[] COL = { "Userid" };

		DatabaseConnection mysql = new DatabaseConnection();

		try {
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(insertString, COL);

			stmt.setInt(1, user.getUserid());
			stmt.setString(2, user.getUsername());
			stmt.setString(3, user.getPassword());
			stmt.setDouble(4, user.getRole());
			stmt.setString(5, user.getEmail());

			stmt.executeUpdate();
			conn.commit();

			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				ID = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.getMessage();
			}

		}

		return ID;
	}// End of registerProduct() method

	// ****************updateUser() method*****************update

	public Boolean updateUsers(UsersClass u) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		System.out.println("Entering updateUsers \n");
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign update string to variable
		String updateString = "update Users " + "set Username = ?, role = ? " + "where Userid = ?";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try {
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(updateString);

			// Set query parameters (?)
			stmt.setString(1, u.getUsername());
			stmt.setInt(2, u.getRole());
			stmt.setInt(3, u.getUserid());

			// Run query and assign to ResultSet
			updateResult = stmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
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
		System.out.println("Exiting updateUsers \n");
		return false;
	} // End of updateUser() method

//****************removeUser() method (i.e., delete)*****************delete

	public Boolean removeUser(int Userid) throws IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign delete string to variable
		String deleteString = "delete from Users where Userid = ?";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try {
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(deleteString);

			// Set query parameters (?)
			stmt.setInt(1, Userid);
			// Run query and assign to ResultSet
			updateResult = stmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
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
		UsersClassDao pdao = new UsersClassDao();
		pdao.testConnection();

		List<UsersClass> plist = pdao.getAllUsers();
		for (UsersClass p : plist)
			System.out.println(p.getUsername());
		// insert
		for (UsersClass p : plist)
			System.out.println(p.getUsername());

		UsersClass p = new UsersClass();
		p.setUsername("EdTom");
		p.setPassword("Ed0000");
		p.setRole(0);
		Integer i = pdao.registerUser(p);

	// update Users table
			   UsersClass u = new UsersClass();
			   u.setUsername("RyanKeller");
			   u.setRole(0);
			   u.setUserid(2);
			   pdao.updateUsers(u);
//		 System.out.println(pdao.getAllUsers());

//Delete from Users	table
//		UsersClass d = new UsersClass();
//		d.setUserid(i);
//		Boolean b = pdao.removeUser(i);
//		System.out.println(b);

	}

}