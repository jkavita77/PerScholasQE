package com.PerScholas_DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.PerScholas_models.Quote;



public class QuoteDao {
		public Integer registerMember(Quote Quote) throws SQLException, ClassNotFoundException, IOException {
			// Declare variables
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;

			// Assign insert statement string to variable
			String insertString = "insert into Quote (homeid, yearlyPremium, expiration,StartDate, active) values (?,?,?,?,?)";

			int ID = -1;
			String[] COL = { "QuoteId" };

			DataBaseConnection mysql = new DataBaseConnection();

			try {
				conn = mysql.getConnection();
				stmt = conn.prepareStatement(insertString, COL);

				stmt.setInt(1, Quote.getHomeid());
				stmt.setDate(2, Quote.getYearlyPremium());
				stmt.setDate(3, Quote.StartDate());
				stmt.setDate(4, Quote.getExpiration());
				stmt.setInt(5, Quote.getActive());
				
				
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

		public Quote getMemberByName(String name) throws ClassNotFoundException, IOException, SQLException {
			// Declare variables
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			Quote m = null;
			
			// Assign query string to variable
			String qString = "select * from Quote where Homeid = ?";
			
			// Create MySqlConnection class instance
			DataBaseConnection databaseConnection = new DataBaseConnection();
			// Begin try/catch block to query the database
			try
			{
				// Connect to database and assign query string to PreparedStatement object
				conn = databaseConnection.getConnection();
				System.out.println("Find Quote by name connection made.");
				stmt = conn.prepareStatement(qString);
				
				// Set query parameters (?)
				stmt.setString(1, name);
				// Run query and assign to ResultSet
				rs = stmt.executeQuery();
				// Retrieve ResultSet and assign to new User
				if (rs.next()) {
					m = new Quote();
					m.setHomeid(rs.getInt(1));
					m.setYearlyPremium(rs.getDouble(2));
					m.setExpiration(rs.getDate(3));
					m.setStartDate(rs.getDate(4));
					m.setYearlyPremium(rs.getDouble(5));
					m.setActive(rs.getInt(6));
					
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
		
//		// End of registerMember() method
		public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
			QuoteDao m_dao = new QuoteDao();

//			// For registering a member
			
//			User m = new User();		
//			m.setUserId(1);
//			m.setFirstName("John");
//			m.setLastName("kom");
//			m.setUserEmail("John@gmail.com");
//			m.setPassword("john1111");
//			m.setUserDOB(01/01/1999);
//			Integer i = m_dao.registerMember(m);
//			
			
			// For selecting a member
			Quote m = m_dao.getMemberByName("");
			System.out.println(m.getHomeid());
			System.out.println(m.getYearlyPremium());
			System.out.println(m.getStartDate());
			System.out.println(m.getExpiration());
			System.out.println(m.getActive());
			
		}



	}
