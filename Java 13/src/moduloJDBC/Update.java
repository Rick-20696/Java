package moduloJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws SQLException{
		Scanner in = new Scanner(System.in);
		Connection connection = ConnectionFactory.getConnectionDatabase();
		String sql = "UPDATE people SET nome = (?) WHERE nome = (?)";
		String userNewName = "";
		String userName = "";
		

		System.out.print("Type the name of people that you want change: ");
		userName = in.nextLine();

		System.out.print("Type the new name: ");
		userNewName = in.nextLine();
		
		PreparedStatement stm = connection.prepareStatement(sql);
		stm.setString(1, userNewName);
		stm.setString(2, userName);
		
		if(stm.executeUpdate() > 0) {
			System.out.println("Records changelled");
		} else {
			System.out.println("Records not was changelled");			
		}
		
		in.close();
		connection.close();
	}
}
