package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main1 
{
	public static void main(String[] args)
	{
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/shopping_app";
		String USERNAME = "root";
		String PASSWORD = "root";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try
		{
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql_query = "insert into users values(?,?,?,?,?)";
			ps = con.prepareStatement(sql_query);
			ps.setString(1, "kamal");
			ps.setString(2, "kamal@gmail.com");
			ps.setString(3, "kamal123");
			ps.setString(4, "male");
			ps.setString(5, "banglore");
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("fail");
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(ps != null)
				{
					ps.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
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
}
