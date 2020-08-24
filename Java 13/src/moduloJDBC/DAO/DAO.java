package moduloJDBC.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import moduloJDBC.ConnectionFactory;

public class DAO {
	/*
	 * Pattern DAO (Data Access Object)
	 * 
	 * This pattern is used when i want separate code of access of business rule.
	 * I'll have method that provide access features
	 */
	private Connection connection;
	
	public int insert(String sql, Object... attributes) {
		try {
			PreparedStatement stm = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			
			addAttributes(stm, attributes);
			
			if (stm.executeUpdate() > 0) {
				ResultSet result = stm.getGeneratedKeys();
				
				if(result.next()) {
					return result.getInt(1);
				}
			}
			
			return -1;
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void addAttributes(PreparedStatement stm, Object[] atr) throws SQLException{
		int cont = 1;
		
		for(Object attributes: atr) {
			if (attributes instanceof String) {
				stm.setString(cont, (String) attributes);
				
				cont++;
			} else if (attributes instanceof Integer) {
				stm.setInt(cont, (Integer) attributes);
				
				cont++;
			}
		}
	}
	
	private Connection getConnection() {
		//I need know if not exist a connection for not to do a new connection unnecessary
		//Too i need know if not is closed for i can use
		
		try {
			
			if(connection != null && !connection.isClosed()) {
				return connection;
			} else {
				connection = ConnectionFactory.getConnectionDatabase();
				return connection;
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
