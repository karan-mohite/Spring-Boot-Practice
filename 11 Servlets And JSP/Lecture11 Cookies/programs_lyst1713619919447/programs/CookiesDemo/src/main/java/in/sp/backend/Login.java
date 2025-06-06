package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginForm")
public class Login extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String myemail = request.getParameter("email1");
		String mypass = request.getParameter("pass1");
		String myrem = request.getParameter("rememberme1");
		
		//System.out.println(myrem);
		
		if(myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
		{
			if(myrem != null)
			{
				Cookie ck = new Cookie("loginStatus", "true");
				ck.setMaxAge(60*60*24*365);
				response.addCookie(ck);
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("/profilePage");
			rd.include(request, response);
		}
		else
		{
			out.println("<h3 style='color:red'> Email id and password didnt matched </h3>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		service(req, resp);
	}
}
