package projectHotelManagement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	private static Connection myConnection;
	/**
	 * Returns connection to data base.
	 * @author Nemanja
	 * @return
	 */
	public static Connection getConnectionToDB() {
		Properties properties = getProperties();

		try {
			myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagamenttest",
					properties);
			return myConnection;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * Returns properties defined for data base.
	 * @author Nemanja
	 * @return
	 */
	public static Properties getProperties() {
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "password1");
		properties.setProperty("useSSL", "false");

		return properties;
	}
	
}
