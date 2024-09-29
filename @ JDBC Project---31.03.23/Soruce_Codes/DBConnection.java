package jdbc_project;

//Import MySQL
import java.sql.*;
public class DBConnection {
	static Connection con;
	public static Connection createDBConnection() {	
		try {
			//load driver
			//stored onto hard disk
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get connection 
			//DriverManager stored in RAM
			//getConnection is a function used to connect to db. 3 params: DB name, username and password
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_schema","root","N@va1510av@N");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
