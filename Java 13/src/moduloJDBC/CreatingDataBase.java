package moduloJDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDataBase {
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true&useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String password = "45876682";

		Connection connection = DriverManager.getConnection(url, user, password);
		
		//For i do a command that going to be run on Database, i need a Statement
		//This is the that will executing a command SQL on Database
		
		//I need pass a statement through of connection to the variable of type Statement.
		//After i pass a String of command that going to be executed
		Statement statement = connection.createStatement();
		statement.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("The database was created with successful!");
		connection.close();
	}
}
