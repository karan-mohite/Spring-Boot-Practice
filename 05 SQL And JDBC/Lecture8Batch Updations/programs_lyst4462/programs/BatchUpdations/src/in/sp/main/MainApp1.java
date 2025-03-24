package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainApp1
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
			
			Statement st = con.createStatement();
			
			st.addBatch("insert into items values(101, 'jeans', 1000)");
			st.addBatch("insert into items values(102, 'shirt', 699)");
			st.addBatch("insert into items values(103, 'top', 899)");
			
			int[] count = st.executeBatch();
			for(int i : count)
			{
				System.out.println(1+" : success");
			}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("fail");
		}
	}
}
