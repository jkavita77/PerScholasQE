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
import Com.PerScholars_JavaClassModels.UserdetailsClass;
import Com.PerScholars_JavaClassModels.UsersClass;

public class UserdetailsClassDao {

	private Connection conn = null;
	private DatabaseConnection dbc = new DatabaseConnection();

	public Connection testConnection() {
		try {
			conn = dbc.getConnection();
			return conn;
		} catch (Exception e) {
			System.out.println("Connection unsuccessful");
			e.printStackTrace();
			return null;
		} finally {
			if (conn != null) {

				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public List<UserdetailsClass> getAllUserDetails() throws SQLException {
		// Declare variables
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		UserdetailsClass u = null;
		List<UserdetailsClass> UserDetailsList = null;

		// Assign query string to a variable
		String qString = "select * from userdetails";

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
			UserDetailsList = new ArrayList<UserdetailsClass>();
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new UserdetailsClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setId(rs.getInt(1));
				u.setUserid(rs.getInt(2));
				u.setEmail(rs.getString(3));
				u.setAddress(rs.getString(4));
				// Add the user to the list
				UserDetailsList.add(u);
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("getAllUserDetails: " + e.getMessage());
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
		return UserDetailsList;
	}

	public UserdetailsClass getUserDetailsByID(int id) throws Exception {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		UserdetailsClass u = null;

		// Assign query string to a variable
		String qString = "select * from userdetails where id = " + id;

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
				u = new UserdetailsClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setId(rs.getInt(1));
				u.setUserid(rs.getInt(2));
				u.setEmail(rs.getString(3));
				u.setAddress(rs.getString(4));
				// Add the user to the list
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("getUserDetailsByID: " + e.getMessage());
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

	public Integer addUserDetails(UserdetailsClass user) {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Assign insert statement string to variable
		String insertString = "insert into userdetails (id, userid, email, address) values (?,?,?,?)";

		int ID = -1;
		String[] COL = { "id" };

		DatabaseConnection mysql = new DatabaseConnection();

		try {
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(insertString, COL);

			stmt.setInt(1, user.getId());
			stmt.setInt(2, user.getUserid());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getAddress());

			stmt.executeUpdate();
			conn.commit();

			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				ID = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("UserdetailsClass: " + e.getMessage());
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
	}// End of addUserDetails() method

	public Boolean updateUserDetails(UserdetailsClass user) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign update string to variable
		String updateString = "update userdetails " + "set email = ?, address = ? " + "where id = ?";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try {
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(updateString);

			// Set query parameters (?)
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getAddress());
			stmt.setInt(3, user.getId());

			// Run query and assign to ResultSet
			updateResult = stmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("updateUserDetails: " + e.getMessage());
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
	} // End of updateUser() method

	public Boolean removeUserDetails(int id) throws IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign delete string to variable
		String deleteString = "delete from userdetails where id = ?";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try {
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(deleteString);

			// Set query parameters (?)
			stmt.setInt(1, id);
			// Run query and assign to ResultSet
			updateResult = stmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("removeUserDetails: " + e.getMessage());
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
		UserdetailsClassDao pdao = new UserdetailsClassDao();
		pdao.testConnection();
		UserdetailsClass u = new UserdetailsClass();

		List<UserdetailsClass> plist = pdao.getAllUserDetails();
		for (UserdetailsClass ud : plist) {
			System.out.println("ID: " + ud.getId()); // insert for (UsersClass p : plist)
			System.out.println("UserID: " + ud.getUserid());
			System.out.println("Address: " + ud.getAddress());
			System.out.println("Mail: +" + ud.getEmail());
			System.out.println("_____________");
		}

//		UserdetailsClass p = new UserdetailsClass();
//		p.setAddress("Irving, TX");
//		p.setEmail("test@test.com");
//		p.setUserid(104);
//		pdao.addUserDetails(p);

		UserdetailsClass q = new UserdetailsClass();
		q.setAddress("Frisco, TX");
		q.setEmail("new@test.com");
		q.setId(1);
		pdao.updateUserDetails(q);

//	// update Users table
//			   UsersClass u = new UsersClass();
//			   u.setUsername("RyanKeller");
//			   u.setRole(0);
//			   u.setUserid(2);
//			   pdao.updateUsers(u);
////		 System.out.println(pdao.getAllUsers());

//Delete from Users	table
//		UsersClass d = new UsersClass();
//		d.setUserid(i);
//		Boolean b = pdao.removeUser(i);
//		System.out.println(b);

	}
}
