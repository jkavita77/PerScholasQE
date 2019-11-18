package com.PerScholas_DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.PerScholas_BclubExcercise.Book;

public class BookDAO {

		
	public Integer registerBook(Book book) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		// Assign insert statement string to variable
		//String insertString = "insert into book (title, synpisis, author, publicationdate, memberid) values (?,?,?,?,?)";
		String insertString = "insert into book (title, synopsis, author,  memberid) values (?,?,?,?)";

		int ID = -1;
		String[] COL = { "bookId" };

		DataBaseConnection mysql = new DataBaseConnection();

		try {
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(insertString, COL);

			stmt.setString(1, book.getTitle());
			stmt.setString(2, book.getSynopsis());
			stmt.setString(3, book.getAuthor());
			stmt.setInt(4, book.getMemberId());
//			stmt.setTimestamp(4, Timestamp.from(book.getPublicationDate()));

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

	public Book getBookByTitle(String name) throws ClassNotFoundException, IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Book b = null;
		
		// Assign query string to variable
		String qString = "select * from book where title = ?";
		
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
				
				   b = new Book(); 
				  b.setBookId(rs.getInt(1)); 
				  b.setTitle(rs.getString(2));
				  b.setSynopsis(rs.getString(3));

				 
			}
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
			System.out.println(e.getStackTrace());
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
		return b;
	}
	
	// End of registerMember() method
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		BookDAO b_dao = new BookDAO();
		
		// For registering a book
		/*
		 * Book book = new Book(); book.setMemberId(1); book.setTitle("Pinky Girl");
		 * book.setAuthor("John R"); book.setSynopsis("Fiction"); Integer i =
		 * b_dao.registerBook(book);
		 */
	
		// For selecting a book
		
		  Book b = b_dao.getBookByTitle("Pinky Girl");
	//	  System.out.println(b.getMemberId()); 
		  System.out.println(b.getTitle());
		
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
		/*
		 * Book m = m_dao.getMemberByName("member1");
		 * System.out.println(m.getMemberId()); System.out.println(m.getEmail());
		 */
		
		
	}
}
