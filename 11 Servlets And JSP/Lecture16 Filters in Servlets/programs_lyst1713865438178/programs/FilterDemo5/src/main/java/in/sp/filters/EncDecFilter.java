package in.sp.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/regForm"}, filterName = "encDecFilter")
public class EncDecFilter implements Filter
{
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc) throws IOException, ServletException
	{
		System.out.println("EncDecFilter is executed");
		
		PrintWriter out = resp.getWriter();
		
		boolean status = false;
		
		//encryption and decryption code
		status = true;				//success
		//status = false;			//fail
		
		if(status)
		{
			fc.doFilter(req, resp);
		}
		else
		{
			out.println("<h3 style='color:red'> Encryption & Decryption Failed </h3>");
		}
	}
}
