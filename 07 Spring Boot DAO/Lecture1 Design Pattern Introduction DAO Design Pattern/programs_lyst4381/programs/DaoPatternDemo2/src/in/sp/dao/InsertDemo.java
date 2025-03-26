package in.sp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo 
{
	public boolean insertValues()
	{
		boolean status = false;
		
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
				status = true;
			}
			else
			{
				status = false;
			}
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
}
