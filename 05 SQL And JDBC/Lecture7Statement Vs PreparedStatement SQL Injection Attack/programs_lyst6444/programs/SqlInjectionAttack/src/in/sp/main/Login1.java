package in.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login1 
{
	public static void main(String[] args) throws Exception
	{
		// -----------get email id and password from user---------
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email Id :");
		String myemail = sc.nextLine();
		
		System.out.println("Enter Password :");
		String mypass = sc.nextLine();
		
		//-------database connection-----------------
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
		
		//-------sql query--------------
		String sql_query = "SELECT * FROM users WHERE email='"+myemail+"' AND password='"+mypass+"'";
		System.out.println(sql_query);
		
		//------------------------------------------------
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql_query);
		
		if(rs.next())
		{
			System.out.println("Welcome : "+rs.getString("name"));
		}
		else
		{
			System.out.println("Email id and password didnt matched");
		}
	}
}
