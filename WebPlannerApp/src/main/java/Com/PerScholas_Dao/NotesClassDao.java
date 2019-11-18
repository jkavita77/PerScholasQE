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
import Com.PerScholars_JavaClassModels.NotesClass;
import Com.PerScholars_JavaClassModels.RemindersClass;

public class NotesClassDao {

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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}//// ****************getAllUsers() method*****************Create

	public List<NotesClass> getAllNotes(int userID) throws SQLException {
		// Declare variables
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		NotesClass u = null;
		List<NotesClass> Userlist = null;

		// Assign query string to a variable
		String qString = "select * from notes where userid = " + userID;
		System.out.println("qString :"+qString);

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

			Userlist = new ArrayList<NotesClass>();
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new NotesClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setId(rs.getInt(1));
				u.setUserId(rs.getInt(2));
				u.setTitle(rs.getString(3));
				u.setContent(rs.getString(4));
//				u.setTimestamp(rs.getTimestamp(4));
				u.setNotecol(rs.getString(5));
				// Add the user to the list
				Userlist.add(u);
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("getAllNotes: " + e.getMessage());
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
	public NotesClass getNotesByID(int id) throws Exception {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		NotesClass u = null;

		// Assign query string to a variable
		String qString = "select * from notes where id = " + id;

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
				u = new NotesClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setId(rs.getInt(1));
				u.setUserId(rs.getInt(2));
				u.setTitle(rs.getString(3));
				u.setContent(rs.getString(4));
//				u.setTimestamp(rs.getTimestamp(5));
				u.setNotecol(rs.getString(6));
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

	// ****************registerNote() method*****************insert

	public Integer registerNote(NotesClass noteClass) {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Assign insert statement string to variable
		String insertString = "insert into notes (userid, title, content, notecol) values (?,?,?,?)";

		int ID = -1;
		String[] COL = { "id" };

		DatabaseConnection mysql = new DatabaseConnection();

		try {
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(insertString, COL);

			stmt.setInt(1, noteClass.getUserId());
			stmt.setString(2, noteClass.getTitle());
			stmt.setString(3, noteClass.getContent());
//			stmt.setTimestamp(5, noteClass.getTimestamp());
			stmt.setString(4, noteClass.getNotecol());

			stmt.executeUpdate();
			conn.commit();

			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				ID = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("registerNote: " + e.getMessage());
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

	public Boolean updateNote(NotesClass u) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign update string to variable
		String updateString = "update notes " + "set title = ?, content = ? , notecol = ?" + "where id = ?";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try {
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(updateString);

			// Set query parameters (?)

			stmt.setString(1, u.getTitle());
			stmt.setString(2, u.getContent());
//			stmt.setTimestamp(5, noteClass.getTimestamp());
			stmt.setString(3, u.getNotecol());
			stmt.setInt(4, u.getId());

			// Run query and assign to ResultSet
			updateResult = stmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("updateNote: " + e.getMessage());
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

	public Boolean removeNote(int id) throws IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign delete string to variable
		String deleteString = "delete from notes where id = ?";
		
		System.out.println("deleteString :"+deleteString);

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
			e.printStackTrace();
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
		NotesClassDao pdao = new NotesClassDao();
		pdao.testConnection();
		NotesClass q = new NotesClass();
		
		q.setUserId(104);
		q.setContent("Pickup from BBal");
		q.setNotecol("Pickup");
		q.setTitle("Pick Up USA");
		pdao.registerNote(q);

//		List<NotesClass> plist = pdao.getAllNotes();
//		for (NotesClass ud : plist) {
//			System.out.println("ID: " + ud.getId()); // insert for (UsersClass p : plist)
//			System.out.println("UserID: " + ud.getUserId());
//			System.out.println("Address: " + ud.getContent());
//			System.out.println("Mail: +" + ud.getNotecol());
//			System.out.println("Mail: +" + ud.getTitle());
//			System.out.println("_____________");
//		}

	}

}
