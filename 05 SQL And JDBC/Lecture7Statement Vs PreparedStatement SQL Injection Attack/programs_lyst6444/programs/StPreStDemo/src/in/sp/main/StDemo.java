package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StDemo 
{
	public static void main(String[] args) throws Exception
	{
		String myname = "aaa";
		String myemail = "aaa@gmail.com";
		String mypass = "aaa123";
		String mygender = "male";
		String mycity = "pune";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
		
		Statement st = con.createStatement();
		int count = st.executeUpdate("INSERT INTO users VALUES('"+myname+"', '"+myemail+"', '"+mypass+"', '"+mygender+"', '"+mycity+"')");
		
		if(count > 0)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
