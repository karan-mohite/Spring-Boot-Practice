package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class Login extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		System.out.println("Email : "+myemail);
		System.out.println("Password : "+mypass);
		
		out.println("Email : "+myemail+"\n");
		out.println("Password : "+mypass);
	}
}
