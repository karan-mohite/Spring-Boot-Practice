package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class MyServlet1 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		out.println("hello servlet 1");
		
		
//		resp.setContentType("text/html");
//		RequestDispatcher rd = req.getRequestDispatcher("/newPage.html");
//		rd.include(req, resp);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("/bbb");
		rd.include(req, resp);
	}
}
