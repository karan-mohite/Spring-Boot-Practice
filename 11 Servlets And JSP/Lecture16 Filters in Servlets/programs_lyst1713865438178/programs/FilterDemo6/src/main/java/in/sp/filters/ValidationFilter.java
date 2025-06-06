package in.sp.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

@WebFilter(urlPatterns = {"/regForm"}, filterName = "validationFilter", initParams = {
		@WebInitParam(name = "myapp", value = "FilterConfig App")
})
public class ValidationFilter implements Filter
{
	FilterConfig filterConfig;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		this.filterConfig=filterConfig;
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc) throws IOException, ServletException
	{
		String str = filterConfig.getInitParameter("myapp");
		System.out.println("Str : "+str);
		
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
