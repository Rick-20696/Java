package moduloJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws SQLException{
		Scanner in = new Scanner(System.in);
		Connection connection = ConnectionFactory.getConnectionDatabase();
		String sql = "DELETE FROM people WHERE nome = (?)";
		String filter = "";
		
		System.out.print("Type the name from people that you want to delete: ");
		filter = in.nextLine();
		
		PreparedStatement stm = connection.prepareStatement(sql);
		stm.setString(1, filter);
		
		if(stm.executeUpdate() > 0) {
			System.out.println("Records changelled");
		} else {
			System.out.println("Records not was changelled");			
		}
		
		in.close();
		connection.close();
	}
}
