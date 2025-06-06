package in.sp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import in.sp.model.User;
import in.sp.service.LoginService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class LoginController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		LoginService logService = new LoginService();
		User user = logService.loginService(myemail, mypass);
		
		if(user != null)
		{
			HttpSession session = req.getSession();
			session.setAttribute("session_user", user);
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else
		{
			out.println("<h3 style='color:red'> Email id and password didnt matched </h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
	}
}
