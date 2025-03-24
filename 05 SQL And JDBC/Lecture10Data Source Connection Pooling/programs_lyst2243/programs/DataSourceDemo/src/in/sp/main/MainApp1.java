package in.sp.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class MainApp1 
{
	public static void main(String[] args)
	{
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/shopping_app");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		
		try(
				Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement("insert into items values(?,?,?)");
			)
		{
			ps.setInt(1, 101);
			ps.setString(2, "shirt");
			ps.setInt(3, 499);
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("fail");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
