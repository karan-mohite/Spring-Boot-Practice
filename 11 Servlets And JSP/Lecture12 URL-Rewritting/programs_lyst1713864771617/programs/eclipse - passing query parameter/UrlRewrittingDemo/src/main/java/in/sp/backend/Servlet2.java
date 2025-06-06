package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		
		String name1 = req.getParameter("myname");
		String phno1 = req.getParameter("myphno");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<h3> Welcome "+name1+" ("+phno1+") </h3>");
		out.println("<h2 style='color:green'> This is Servlet 2 Page </h2>");
		out.println("<a href='servlet1'> Click Here </a> to go on 'Servlet 1' Page");
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
