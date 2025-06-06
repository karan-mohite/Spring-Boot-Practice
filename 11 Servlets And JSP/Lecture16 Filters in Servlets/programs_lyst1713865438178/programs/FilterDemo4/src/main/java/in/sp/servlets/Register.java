package in.sp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name1");
		String email = req.getParameter("email1");
		String phno = req.getParameter("phoneno1");
		String city = req.getParameter("city1");
		
		//database insertion code
		out.println("<h2 style='color:green'> Success </h2>");
		out.println("<h3> Name : "+name+" </h3>");
		out.println("<h3> Email : "+email+" </h3>");
		out.println("<h3> Phone No. : "+phno+" </h3>");
		out.println("<h3> City : "+city+" </h3>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		service(req, resp);
	}
}
