package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE name=?");
		ps.setString(1, "amit");
		
		int count = ps.executeUpdate();
		if(count > 0)
		{
			System.out.println("user deleted successfully");
		}
		else
		{
			System.out.println("user not deleted due to some error");
		}
		
		ps.close();
		con.close();
	}
}
