package moduloJDBC.Select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import moduloJDBC.ConnectionFactory;

public class Select {
	public static void main(String[] args) throws SQLException{
		//I create a Class "People" to pass the query in the Class, but i can do of other way
		
		Connection connection = ConnectionFactory.getConnectionDatabase();
		String sql = "SELECT * FROM people";
		
		Statement stm = connection.createStatement();
		
		//Like i want to store the result i'll using "executeQuery" cause this method return a ResultSet
		//By ResultSet i can catch the columns 
		ResultSet result = stm.executeQuery(sql);
		List<People> peoples = new ArrayList<>();
		
		//Way 1: by Class
		while(result.next()) {
			//I choose of the type of variable and after i say the name of column or the index 
			int cod = result.getInt("cod");
			String name = result.getString("nome");
			
			peoples.add(new People(cod, name));
		}
		
		for(People p: peoples) {
			System.out.println(p.getCod() + "|" + p.getName());
		}
		
		//Way 2: direct
		while(result.next()) {
			int cod = result.getInt("cod");
			String name = result.getString("nome");
			
			System.out.println(cod + " " + name);;
		}		

		stm.close();
		connection.close();
	}
}
