package moduloJDBC.DAO;

import java.util.Scanner;

public class DAOInsert {
	public static void main(String[] args) {
		DAO dao = new DAO();
		Scanner in = new Scanner(System.in);
		String sql = "INSERT INTO people (nome) VALUES (?)";
		String user = "";
		
		System.out.print("Type the name from people that you want inserting: ");
		user = in.nextLine();
		
		if(dao.insert(sql, user) > 0) {
			System.out.println("People was successfully registered ");
		} else {
			System.out.println("People have not been successfully registered ");			
		}
		
		in.close();
	}
}
