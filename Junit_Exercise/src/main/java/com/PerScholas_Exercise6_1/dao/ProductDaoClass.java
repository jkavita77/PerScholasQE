package com.PerScholas_Exercise6_1.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoClass {
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

	public List<Product> getAllUsers() throws SQLException {
		// Declare variables
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Product u = null;
		List<Product> productlist = null;

		// Assign query string to a variable
		String qString = "select * from product";

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
			//Create list to hold Product objects
			productlist = new ArrayList<Product>();
			// Read the ResultSet instance
			while (rs.next()) {
				// Each iteration creates a new user
				u = new Product();
				// Assign columns/fields to related fields in the Product object
				// 1,2 and 3 represent column numbers/positions
				u.setProductId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPrice(rs.getDouble(3));
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
	
	public Integer registerProduct(Product user) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		// Assign insert statement string to variable
		String insertString = "insert into product (name, price) values (?,?)";
		
	    int ID = -1;
	    String[] COL = {"product_id"};
	    
	    DatabaseConnection mysql = new DatabaseConnection();
	    
	    try
	    {
	        conn = mysql.getConnection();
	        stmt = conn.prepareStatement(insertString, COL);
	        
	        stmt.setString(1, user.getName());
	        stmt.setDouble(2, user.getPrice());
	        
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

	
	//****************getUserById() method*****************select by id

	public Product getProductById(int ProoductId) throws ClassNotFoundException, IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Product u = null;
		
		// Assign query string to variable
		String qString = "select * from product where product_id = ?";
		
		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		
		// Begin try/catch block to query the database
		try
		{
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(qString);
			
			// Set query parameters (?)
			stmt.setInt(1, ProoductId); // user_id if from String parameter passed to method
			
			// Run query and assign to ResultSet
			rs = stmt.executeQuery();
			
			// Retrieve ResultSet and assign to new Product
			if (rs.next()) {
				u = new Product();
				u.setProductId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPrice(rs.getDouble(3));
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
		return u;
	} // End of getUserById() method
	
//	//****************getUserByName or login method*****************select by name

	public Product getProductByName(String name) throws ClassNotFoundException, IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Product u = null;
		
		// Assign query string to variable
		String qString = "select * from Product where name = ?";
		
		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try
		{
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(qString);
			
			// Set query parameters (?)
			stmt.setString(1, name); // user_id if from String parameter passed to method
			// Run query and assign to ResultSet
			rs = stmt.executeQuery();
			// Retrieve ResultSet and assign to new Product
			if (rs.next()) {
				u = new Product();
				u.setProductId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPrice(rs.getDouble(3));
			}
		}
		catch (ClassNotFoundException | IOException | SQLException e)
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
		return u;
	}  // End of getUserByName() method
	
//	//****************updateUser() method*****************update
	
	public Boolean updateProduct(Product u) throws SQLException, ClassNotFoundException, IOException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;
		
		// Assign update string to variable
		String updateString = "update Product "
				+ "set name = ?, price = ? "
				+ "where Product_id = ?";
		
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
			stmt.setDouble(2, u.getPrice());
			stmt.setInt(3, u.getProductId());
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
	
	public Boolean removeProduct(int Product_Id) throws IOException, SQLException {
		// Declare variables
		Connection conn = null;
		PreparedStatement stmt = null;
		Integer updateResult = null;
		
		// Assign delete string to variable
		String deleteString = "delete from Product where Product_Id = ?";
		
		// Create DatabaseConnection class instance
		DatabaseConnection mysql = new DatabaseConnection();
		// Begin try/catch block to query the database
		try
		{
			// Connect to database and assign query string to PreparedStatement object
			conn = mysql.getConnection();
			stmt = conn.prepareStatement(deleteString);
			
			// Set query parameters (?)
			stmt.setInt(1, Product_Id);
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
	
 // End of UserDAO class
public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
	ProductDaoClass pdao = new ProductDaoClass();
    pdao.testConnection();
    List<Product> plist  = pdao.getAllUsers();
   for(Product p: plist)
	   System.out.println(p.getName());
   
   Product p = new Product();
   p.setName("BagPack");
   p.setPrice(50.0);
   pdao.registerProduct(p);
   
   //select by id and name
   System.out.println(pdao.getProductById(4));
   System.out.println(pdao.getProductByName("Laptop"));
  
   
   //update 
   Product u = new Product();
   u.setName("Iphone");
   u.setPrice(919.0);
   u.setProductId(11);
   pdao.updateProduct(u);
   System.out.println(pdao.getProductById(11));
  
   //delete
   Product d = new Product();
   d.setProductId(8);
   pdao.removeProduct(8);
   System.out.println(pdao.getProductById(8));
}
}