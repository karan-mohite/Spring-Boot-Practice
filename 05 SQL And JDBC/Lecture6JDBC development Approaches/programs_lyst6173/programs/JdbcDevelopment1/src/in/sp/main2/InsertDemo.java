package in.sp.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo
{
	public static void main(String[] args)
	{
		try
		{
			Connection con = DatabaseUtility.getConnection();
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO users VALUES(?,?,?,?,?)");
			ps.setString(1, "ravi");
			ps.setString(2, "ravi@gmail.com");
			ps.setString(3, "ravi123");
			ps.setString(4, "male");
			ps.setString(5, "delhi");
			
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
