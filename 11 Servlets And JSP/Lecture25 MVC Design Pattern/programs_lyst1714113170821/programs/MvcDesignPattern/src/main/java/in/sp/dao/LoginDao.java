package in.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.sp.dbcon.DbConnection;
import in.sp.model.User;

public class LoginDao 
{
	public User loginDao(String email, String pass)
	{
		User user = null;
		
		try
		{
			Connection con = DbConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				user = new User();
				
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return user;
	}
}
