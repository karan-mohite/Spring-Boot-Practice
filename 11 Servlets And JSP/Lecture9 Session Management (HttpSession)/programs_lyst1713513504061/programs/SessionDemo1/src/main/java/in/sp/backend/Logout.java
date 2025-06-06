package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logout extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		session.invalidate();
		
		//resp.sendRedirect("login.html");
		
		try
		{
			out.println("Name : "+session.getAttribute("session_name"));
		}
		catch(Exception e)
		{
			out.println("<h3 style='color:red'> Name cannot get as session object is deleted </h3>");
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/login.html");
		rd.include(req, resp);
	}
}
