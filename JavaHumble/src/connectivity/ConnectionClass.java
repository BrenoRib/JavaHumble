package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	private static String caminho = "jdbc:mysql://localhost/javahumble" ;
	private static String user = "root"; 
	private static String password = "kiomaro";
	
	public static Connection ligar() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(caminho,user,password);
			
		}catch(ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
		
		//return null;
	}
	
	/*public <INSERT> Connection getConnection() {
		
		String dbName = "unirio";
		String userName= "root";
		String password= "kiomaro";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/"+
dbName+userName+password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
		}
	*/
}
