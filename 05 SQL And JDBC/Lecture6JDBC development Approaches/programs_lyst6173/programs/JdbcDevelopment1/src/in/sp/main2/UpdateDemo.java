package in.sp.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo 
{
	public static void main(String[] args)
	{
		try
		{
			Connection con = DatabaseUtility.getConnection();
			
			PreparedStatement ps = con.prepareStatement("UPDATE users SET city=? WHERE email=?");
			ps.setString(1, "mumbai");
			ps.setString(2, "ravi@gmail.com");
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				System.out.println("user inserted successfully");
			}
			else
			{
				System.out.println("user not registered due to some error");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseUtility.closeConnection();
		}
	}
}
