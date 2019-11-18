package com.perscholas.jdbc;

import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class DaoClass {
	final Properties prop = new Properties();
	
	try {
		final InputStream inputStream = DAO.class.getClassLoader()
				.getResourceAsStream(
						"properties/db.properties");
		prop.load(inputStream);
		Class.forName(prop.getProperty("driver"));
		this.connection =
				DriverManager.getConnection(prop.getProperty("url"),
				prop.getProperty("user"), prop.getProperty("password"));
		// If the connection fails the application won't make it to this point
		System.out.println("Connected to database.");
	} catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
		e.getStackTrace();
	}


}

}
