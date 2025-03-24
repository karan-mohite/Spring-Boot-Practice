package in.sp.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility 
{
	static Connection con;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
		
		return con;
	}
	
	public static void closeConnection()
	{
		try
		{
			if(con != null)
			{
				con.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
