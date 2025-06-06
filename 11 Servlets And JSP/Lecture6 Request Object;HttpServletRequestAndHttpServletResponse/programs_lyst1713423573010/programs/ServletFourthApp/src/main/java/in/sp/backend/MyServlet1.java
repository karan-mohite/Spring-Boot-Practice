package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
		
		Enumeration<String> headernames_enum = req.getHeaderNames();
		while(headernames_enum.hasMoreElements())
		{
			String headerName = headernames_enum.nextElement();
			String headerValue = req.getHeader(headerName);
			
			out.print(headerName+" - "+headerValue+"\n\n");
		}
	}
}
