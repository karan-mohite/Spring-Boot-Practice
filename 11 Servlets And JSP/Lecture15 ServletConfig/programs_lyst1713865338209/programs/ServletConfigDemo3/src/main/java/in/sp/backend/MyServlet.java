package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
				urlPatterns = {"/myservlet"},
				initParams = {
						@WebInitParam(name="name1", value="Amit"),
						@WebInitParam(name="email1", value="amit@gmail.com")
				}
			)
public class MyServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		
		ServletConfig config = getServletConfig();
		
		String myname = config.getInitParameter("name1");
		String myemail = config.getInitParameter("email1");
		
		out.println("Name : "+myname);
		out.println("Email : "+myemail);
	}
}
