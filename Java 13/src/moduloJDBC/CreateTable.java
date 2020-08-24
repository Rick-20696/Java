package moduloJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws SQLException{
		Connection connection = ConnectionFactory.getConnectionDatabase();
		Statement statement = connection.createStatement();
		String SQLCommand = "CREATE TABLE IF NOT EXISTS people ("
				+ "cod INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		
		statement.execute(SQLCommand);
		
		System.out.println("The table was created with successful!");
		
		connection.close();
	}
}
