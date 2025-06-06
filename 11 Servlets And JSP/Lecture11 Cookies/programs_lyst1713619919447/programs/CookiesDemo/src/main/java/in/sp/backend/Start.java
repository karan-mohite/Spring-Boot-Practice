package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/start")
public class Start extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		boolean logStatus = false;
		
		Cookie[] ck = request.getCookies();
		
		if(ck != null)
		{
			for(Cookie c : ck)
			{
				if(c.getName().equals("loginStatus") && c.getValue().equals("true"))
				{
					logStatus = true;
					break;
				}
			}
		}
		
		if(logStatus == true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/profilePage");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.forward(request, response);
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
