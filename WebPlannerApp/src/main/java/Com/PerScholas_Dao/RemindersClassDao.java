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
import Com.PerScholars_JavaClassModels.RemindersClass;

public class RemindersClassDao {

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
	}

	public List<RemindersClass> getAllReminders(int userid) throws SQLException {
		// Declare variables
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		RemindersClass u = null;
		List<RemindersClass> reminderList = null;

		// Assign query string to a variable
		String qString = "select * from reminders where userid = "+ "'" + userid +"'";
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
			reminderList = new ArrayList<RemindersClass>();
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new RemindersClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setReminderId(rs.getInt(1));
				u.setUserId(rs.getInt(2));
				u.setReminderType(rs.getString(3));
				u.setFrequency(rs.getString(4));
				u.setIsActive(rs.getString(5));
				u.setRemarks(rs.getString(6));
				// Add the user to the list
				reminderList.add(u);
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("getAllReminders: " + e.getMessage());
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
		return reminderList;
	}

	public RemindersClass getReminderByReminderID(int reminderid) throws Exception {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		RemindersClass u = null;

		// Assign query string to a variable
		String qString = "select * from reminders where id = " + reminderid;

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
				u = new RemindersClass();
				// Assign columns/fields to related fields in the Users object
				// 1,2 and 3 represent column numbers/positions
				u.setReminderId(rs.getInt(1));
				u.setUserId(rs.getInt(2));
				u.setReminderType(rs.getString(3));
				u.setFrequency(rs.getString(4));
				u.setIsActive(rs.getString(5));
				u.setRemarks(rs.getString(6));
				// Add the user to the list
				// Repeat until rs.next() returns false (i.e., end of ResultSet)
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			System.out.println("getReminderByReminderID: " + e.getMessage());
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
	
	public Integer addReminder(RemindersClass reminder) {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Assign insert statement string to variable
		String insertString = "insert into reminders (userid, remindertype, frequency, isactive, remarks) values (?,?,?,?,?)";

		int ID = -1;
		String[] COL = { "id" };

		DatabaseConnection mysql = new DatabaseConnection();

		try {
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(insertString, COL);

			stmt.setInt(1, reminder.getUserId());
			stmt.setString(2, reminder.getReminderType());
			stmt.setString(3, reminder.getFrequency());
			stmt.setString(4, reminder.getIsActive());
			stmt.setString(5, reminder.getRemarks());

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
	}// End of addUserDetails() method

	public Boolean updateReminders(RemindersClass reminder) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign update string to variable
		String updateString = "update userdetails " + "set remindertype = ?, frequency = ? , isactive = ? " + "where id = ?";

		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try {
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(updateString);

			// Set query parameters (?)
			stmt.setString(1, reminder.getReminderType());
			stmt.setString(2, reminder.getFrequency());
			stmt.setString(3, reminder.getIsActive());
			stmt.setInt(4, reminder.getReminderId());

			// Run query and assign to ResultSet
			updateResult = stmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("updateReminders: " + e.getMessage());
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

	public Boolean removeReminders(int id) throws IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;

		// Assign delete string to variable
		String deleteString = "delete from reminders where id = ?";

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
			System.out.println("removeReminders: " + e.getMessage());
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
		RemindersClassDao pdao = new RemindersClassDao();
		pdao.testConnection();
		
		RemindersClass q = new RemindersClass();
		q.setFrequency("Dailly");
		q.setReminderType("Reading");
		q.setUserId(104);
		q.setIsActive("1");
		pdao.addReminder(q);
		
//		List<RemindersClass> plist = pdao.getAllReminders();
//		for (RemindersClass rd : plist) {
//			System.out.println("ID: " + rd.getReminderId()); // insert for (UsersClass p : plist)
//			System.out.println("UserID: " + rd.getUserId());
//			System.out.println("Type: " + rd.getReminderType());
//			System.out.println("Frequency: +" + rd.getFrequency());
//			System.out.println("IsActive: +" + rd.getIsActive());
//			System.out.println("_____________");
//		}

//		UserdetailsClass p = new UserdetailsClass();
//		p.setAddress("Irving, TX");
//		p.setEmail("test@test.com");
//		p.setUserid(104);
//		pdao.addUserDetails(p);



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
