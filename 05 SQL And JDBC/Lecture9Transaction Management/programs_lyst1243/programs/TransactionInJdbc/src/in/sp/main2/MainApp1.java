package in.sp.main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp1
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
			
			try
			{
				con.setAutoCommit(false);
				
				Statement st1 = con.createStatement();
				
				int count1 = st1.executeUpdate("insert into items values(101, 'jeans', 999)");
				int count2 = st1.executeUpdate("insert into items values(102, 'shirt', 'aaa')");
				int count3 = st1.executeUpdate("insert into items values(103, 'top', 799)");
				
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
			catch(Exception e)
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
