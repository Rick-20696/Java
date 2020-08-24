package moduloJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingData {
	public static void main(String[] args) throws SQLException {
		//I'll not use Statement for insert data because the problem with the SQL Injection. It's recommended to use PreparedStatement! 		
		Scanner in = new Scanner(System.in);
		System.out.print("Type on a name of people: ");
		String name = in.nextLine();
		Connection connection = ConnectionFactory.getConnectionDatabase();
		
		//A attack of SQL Injection happens when i let a String as input of informations of users and i use to execute a SQL command
		//String SQLCommand = "INSERT INTO people (name) VALUES ('" + name + "');";

		//If i do this can happening something like
		//String SQLInjection = "insert into people (name) values ('Rick'); delete from people where ('1' = '1');";
		
		//For do something more safe i use "?". It means that i need pass a parameter to this and i going not suffer a SQL Injection
		String SQLCommand = "INSERT INTO people (nome) VALUES (?)";
		PreparedStatement pStmt = connection.prepareStatement(SQLCommand);
		pStmt.setString(1, name);
		pStmt.execute();
		
		System.out.println("The people has been successfully inserted!");
		
		//If the database is not on safe mode, the database going to be attacked 
		in.close();
		connection.close();
	}
}
