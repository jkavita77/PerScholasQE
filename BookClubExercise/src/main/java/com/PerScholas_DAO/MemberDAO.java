
package com.PerScholas_DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.PerScholas_BclubExcercise.Member;

public class MemberDAO {

		
	public Integer registerMember(Member member) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Assign insert statement string to variable
		String insertString = "insert into Member (name, email, password, favoriteGenre) values (?,?,?,?)";

		int ID = -1;
		String[] COL = { "memberId" };

		DataBaseConnection mysql = new DataBaseConnection();

		try {
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(insertString, COL);

			stmt.setString(1, member.getName());
			stmt.setString(2, member.getEmail());
			stmt.setString(3, member.getPassword());
			stmt.setString(4, member.getFavoriteGenre());

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

	public Member getMemberByName(String name) throws ClassNotFoundException, IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Member m = null;
		
		// Assign query string to variable
		String qString = "select * from member where name = ?";
		
		// Create MySqlConnection class instance
		DataBaseConnection databaseConnection = new DataBaseConnection();
		// Begin try/catch block to query the database
		try
		{
			// Connect to database and assign query string to PreparedStatement object
			conn = databaseConnection.getConnection();
			System.out.println("Find member by name connection made.");
			stmt = conn.prepareStatement(qString);
			
			// Set query parameters (?)
			stmt.setString(1, name);
			// Run query and assign to ResultSet
			rs = stmt.executeQuery();
			// Retrieve ResultSet and assign to new User
			if (rs.next()) {
				m = new Member();
				m.setMemberId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setEmail(rs.getString(3));
				m.setPassword(rs.getString(4));
				m.setFavoriteGenre(rs.getString(5));
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
	
	// End of registerMember() method
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		MemberDAO m_dao = new MemberDAO();

		// For registering a member
		/**
		Member m = new Member();		
		m.setMemberId(1);
		m.setName("member1");
		m.setEmail("member@gmail.com");
		m.setPassword("pass1111");
		m.setFavoriteGenre("Fiction");
		Integer i = m_dao.registerMember(m);
		**/
		
		// For selecting a member
		Member m = m_dao.getMemberByName("member1");
		System.out.println(m.getMemberId());
		System.out.println(m.getEmail());
		
		
	}
}

