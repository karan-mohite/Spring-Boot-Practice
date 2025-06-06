package in.sp.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ValidationFilter implements Filter
{
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc) throws IOException, ServletException
	{
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name1");
		String email = req.getParameter("email1");
		String phno = req.getParameter("phoneno1");
		String city = req.getParameter("city1");
		
		if(name.length() < 3)
		{
			out.println("<h3 style='color:red'> Name length should be greater than 3 characters </h3>");
		}
		else if(!email.endsWith("@gmail.com"))
		{
			out.println("<h3 style='color:red'> Email id is not valid </h3>");
		}
		else if(phno.length() != 10)
		{
			out.println("<h3 style='color:red'> Phone no. is not valid </h3>");
		}
		else if(city.length() < 3)
		{
			out.println("<h3 style='color:red'> City is not valid </h3>");
		}
		else
		{
			fc.doFilter(req, resp);
		}
	}
}
