package in.sp.jdbcdemo;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish the connection between java and database
		DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
		
		System.out.println("success");
	}
}