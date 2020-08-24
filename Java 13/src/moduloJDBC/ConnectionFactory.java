package moduloJDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	public static Connection getConnectionDatabase() {
		try {
			Properties pro = getProperties();
			String url = pro.getProperty("database.url");
			String user = pro.getProperty("database.user");
			String password = pro.getProperty("database.password");
			
			return DriverManager.getConnection(url, user, password);			
		} catch(SQLException | IOException e) {
			//I need returning something that will be a Connection by all ways.
			//So i'll throw a Runtime Exception that will be the cause of SQL Exception
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException{
		/*
		 * I need creating an file of type Property cause maybe i want change the informations of connection (URL, User, Password).
		 * 
		 * The file is of type Key-Value. When i go catch the informations, i'll take the key.
		 * Like the informations are in a "text-file" i can change any time.
		 * If the informations were in a Class i could not change when i go generate the ByteCode 
		 */
		
		//The method "load" need of a InputStream i'll take the String (way of file) like a resource and parse to Stream
		Properties pro = new Properties();
		String way = "/Connection.properties";
		
		pro.load(ConnectionFactory.class.getResourceAsStream(way));
		return pro;
	}
}
