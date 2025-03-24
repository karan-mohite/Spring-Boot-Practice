package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main3
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("select * from users");
		ResultSet rs = ps.executeQuery();
		
		//it will move the resultset cursor to first row and then second row
		rs.next();
		rs.next();
		
		String myname = rs.getString("name");
		String myemail = rs.getString("email");
		String mypass = rs.getString("password");
		String mygender = rs.getString("gender");
		String mycity = rs.getString("city");
		
		System.out.println(myname+" - "+myemail+" - "+mypass+" - "+mygender+" - "+mycity+"\n");
		
//		rs.close();
//		ps.close();
//		con.close();
	}
}
