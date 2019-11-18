package com.prescholar.servletjsp_class_demo.dao;

import java.beans.Statement;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MariadbConnection {
	public Connection getConnection() throws ClassNotFoundException,
	IOException, SQLException {
	final Properties prop = new Properties();
	final InputStream inputStream = MariadbConnection.class.getClassLoader()
			.getResourceAsStream(
					"properties/db.properties");
	prop.load(inputStream);
	Class.forName(prop.getProperty("driver"));
	final Connection connection =
			DriverManager.getConnection(prop.getProperty("url"),
			prop.getProperty("user"), prop.getProperty("password"));
	return connection;
	}
 /*// our SQL SELECT query. 
    // if you only need a few columns, specify them by name instead of using "*"
    String query = "SELECT * FROM student";
    // create the java statement
    Statement st = conn.createStatement();
    
    // execute the query, and get a java resultset
    ResultSet rs = st.executeQuery(query);
    
    // iterate through the java resultset
    while (rs.next())
    {
      int id = rs.getInt("student_id");
      String firstName = rs.getString("name");
      String lastName = rs.getString("email");
      Date dateCreated = rs.getDate("hometown");
      boolean isAdmin = rs.getBoolean("courseSelected");
      
      
      // print the results
      System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
    }
    st.close();
  }
  catch (Exception e)
  {
    System.err.println("Got an exception! ");
    System.err.println(e.getMessage());
  }
}*/
}
	
