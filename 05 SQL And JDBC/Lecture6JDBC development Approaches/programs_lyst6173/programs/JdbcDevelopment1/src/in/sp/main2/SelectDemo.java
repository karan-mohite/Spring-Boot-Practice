package in.sp.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo
{
	public static void main(String[] args)
	{
		try
		{
			Connection con = DatabaseUtility.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from users");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String myname = rs.getString("name");
				String myemail = rs.getString("email");
				String mypass = rs.getString("password");
				String mygender = rs.getString("gender");
				String mycity = rs.getString("city");
				
				System.out.println(myname+" - "+myemail+" - "+mypass+" - "+mygender+" - "+mycity+"\n");
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
