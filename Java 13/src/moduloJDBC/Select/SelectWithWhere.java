package moduloJDBC.Select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import moduloJDBC.ConnectionFactory;

public class SelectWithWhere {
	public static void main(String[] args) throws SQLException{
		Connection connection = ConnectionFactory.getConnectionDatabase();
		Scanner in = new Scanner(System.in);
		String sql = "SELECT * FROM people WHERE nome LIKE (?)";
		String user = "";
		
		System.out.println("You want to search by\n1 - letters that start the name\n2 - letters that is between the name\n3 - letters ending the name");
		user = in.nextLine();
		
		if (user.equals("1")) {
			System.out.print("Type the letters that begin the name: ");
			user = in.nextLine() + "%";			
		} else if (user.equals("2")) {
			System.out.print("Type the letters that is between the name: ");
			user = "%" + in.nextLine() + "%";						
		} else if (user.equals("3")) {
			System.out.print("Type the letters ending the name: ");
			user = "%" + in.nextLine();									
		} else {
			System.out.println("Invalid option selected");
		}
		
		PreparedStatement pStm = connection.prepareStatement(sql);
		pStm.setString(1, user);
		ResultSet result = pStm.executeQuery();
		
		while(result.next()) {
			System.out.println(result.getInt("cod") + "|" + result.getString("nome"));
		}
		
		in.close();
		connection.close();
	}
}
