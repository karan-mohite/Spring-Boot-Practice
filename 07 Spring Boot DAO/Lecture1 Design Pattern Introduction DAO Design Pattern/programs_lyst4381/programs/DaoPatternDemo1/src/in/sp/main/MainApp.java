package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainApp
{
	public static void main(String[] args)
	{
		System.out.println("---------Application Started---------");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sb_jdbc", "root", "root");
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO items VALUES(?,?,?)");
			ps.setString(1, "101");
			ps.setString(2, "T-Shirt");
			ps.setString(3, "600");
			
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
		catch(Exception e)
		{
			System.out.println("fail");
			e.printStackTrace();
		}
		
		System.out.println("---------Application Finished---------");
	}
}
