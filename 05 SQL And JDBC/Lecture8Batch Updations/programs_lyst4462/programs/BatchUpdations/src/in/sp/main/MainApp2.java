package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainApp2
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
			
			PreparedStatement ps = con.prepareStatement("insert into items values(?,?,?)");
			
			ps.setInt(1, 101);
			ps.setString(2, "jeans");
			ps.setInt(3, 1000);
			ps.addBatch();
			
			ps.setInt(1, 102);
			ps.setString(2, "shirt");
			ps.setInt(3, 799);
			ps.addBatch();
			
			ps.setInt(1, 103);
			ps.setString(2, "top");
			ps.setInt(3, 899);
			ps.addBatch();
			
			int[] count = ps.executeBatch();
			for(int i:count)
			{
				System.out.println(i+" : success");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
