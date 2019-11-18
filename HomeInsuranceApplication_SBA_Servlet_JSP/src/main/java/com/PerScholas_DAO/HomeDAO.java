package com.PerScholas_DAO;


	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import com.PerScholas_models.Home;
	
	public class HomeDAO {
	    
	    //****************registerhome() method*****************
	    
	            public Integer registerhome(Home Home) throws SQLException, ClassNotFoundException, IOException {
	                // Declare variables
	                Connection conn = null;
	                PreparedStatement stmt = null;
	                ResultSet rs = null;
	                
	                // Assign insert statement string to variable
	                String insertString = "insert into Home (Address1, Address2,City, State, Zip, YearBuilt,Homevalue) values (?,?,?,?,?,?,?)";
	                
	                int ID = -1;
	                String[] COL = {"HomeID"};
	                
	                DataBaseConnection databaseConnection = new DataBaseConnection();
	                
	                try
	                {
	                    conn = databaseConnection.getConnection();
	                    stmt = conn.prepareStatement(insertString, COL);
	                    
	                    stmt.setString(1, Home.getAddress1());
	                    stmt.setString(2, Home.getAddress2());
	                    stmt.setString(3, Home.getCity());
	                    stmt.setString(4, Home.getState());
	                    stmt.setString(5, Home.getZip());
	                    stmt.SetDate(6, Home.getYearBuilt());
	                    stmt.setDouble(7, Home.getHomeValue());
	                    
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
	            } // End of registerhome() method
	            
}
