
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
}