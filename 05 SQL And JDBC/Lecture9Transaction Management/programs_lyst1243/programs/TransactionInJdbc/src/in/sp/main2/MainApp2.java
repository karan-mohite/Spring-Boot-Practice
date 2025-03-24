package in.sp.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainApp2 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
			
			con.setAutoCommit(false);
			
			try
			{
				PreparedStatement ps1 = con.prepareStatement("insert into items values(101, 'jeans', 999)");
				PreparedStatement ps2 = con.prepareStatement("insert into items values(102, 'shirt', 'aaa')");
				PreparedStatement ps3 = con.prepareStatement("insert into items values(103, 'top', 799)");
				
				int count1 = ps1.executeUpdate();
				int count2 = ps2.executeUpdate();
				int count3 = ps3.executeUpdate();
				
				if(count1>0 && count2>0 && count3>0)
				{
					con.commit();
					System.out.println("success");
				}
				else
				{
					con.rollback();
					System.out.println("fail");
				}
			}
			catch(SQLException e)
			{
				try
				{
					con.rollback();
					System.out.println("fail");
				}
				catch(SQLException ee)
				{
					ee.printStackTrace();
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
