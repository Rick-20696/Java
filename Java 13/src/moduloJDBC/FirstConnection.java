package moduloJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstConnection {
	public static void main(String[] args) throws SQLException{
		
		/* Connection with DATABASE
		 * 
		 * For connected Java with some database we need of Drive of Connection!
		 * The Drive it's a external library of database. 
		 * Remembering that the project must recognize the library,
		 * For this on happen i need put the Driver as a external library.
		 * 
		 * I can connect with only the URL or URL, User and Password.
		 * The User and Password are those used to connect on the database
		 * 
		 */
		
		/* URL
		 * 
		 * JDBC: Java Database Connective is the begin of String
		 * MYSQL: It's the drive of connection
		 * LocalHost: I'ts where i will access the database
		 * 3306: It's the door of connection
		 * Database: It's the name of database that i will connect, i not using because i have not one.
		 * verifyServerCertificate: It's the verification of server. I not need because only i that will access.
		 * SLL: is a type of security recommended in only connection
		 * TimeZone: It's to adjust the time and time zone, can give errors
		 */
		String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true&useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String password = "45876682";
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		System.out.println("Connected");
		
		connection.close();
	}
}
