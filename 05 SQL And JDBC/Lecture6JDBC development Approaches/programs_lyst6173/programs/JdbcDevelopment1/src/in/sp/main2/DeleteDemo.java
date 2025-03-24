package in.sp.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo
{
	public static void main(String[] args)
	{
		try
		{
			Connection con = DatabaseUtility.getConnection();
			
			PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE name=?");
			ps.setString(1, "amit");
			
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
