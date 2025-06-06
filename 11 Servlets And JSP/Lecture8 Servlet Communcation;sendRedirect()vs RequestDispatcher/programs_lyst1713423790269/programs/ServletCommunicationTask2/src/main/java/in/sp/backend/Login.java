package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		if(myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/profile.html");
			rd.forward(req, resp);
		}
		else
		{
			out.println("<h4 style='color: red;'> Email id and password didnt matched </h4>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
	}
}
