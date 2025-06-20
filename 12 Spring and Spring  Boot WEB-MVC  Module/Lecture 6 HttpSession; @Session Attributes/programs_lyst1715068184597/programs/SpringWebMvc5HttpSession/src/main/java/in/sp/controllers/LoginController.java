package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController
{
	@GetMapping("/loginPage")
	public String openLoginPage()
	{
		return "login";
	}
	
	
	@PostMapping("/loginForm")
	public String loginForm(HttpServletRequest req, Model model, HttpSession session)
	{
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		if(myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
		{
			session.setAttribute("session_name", "Deepak Panwar");
			session.setAttribute("session_gender", "Male");
			session.setAttribute("session_city", "Delhi");
			
			return "profile";
		}
		else
		{
			model.addAttribute("login_error", "Email id and password didnt matched");
			return "login";
		}
	}
}
