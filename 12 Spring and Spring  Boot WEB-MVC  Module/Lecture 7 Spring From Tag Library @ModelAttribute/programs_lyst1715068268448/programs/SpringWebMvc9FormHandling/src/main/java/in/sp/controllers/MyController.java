package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.beans.Student;

@Controller
public class MyController
{
	@GetMapping("/regPage")
	public String openRegPage()
	{
		return "register";
	}
	
	@PostMapping("/regForm")
	public String handleRegForm(HttpServletRequest req, Model model)
	{
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		String mygender = req.getParameter("gender1");
		String mycity = req.getParameter("city1");
		
		// insert into database code
		
		Student std = new Student();
		std.setName(myname);
		std.setEmail(myemail);
		std.setPassword(mypass);
		std.setGender(mygender);
		std.setCity(mycity);
		
		model.addAttribute("model_std", std);
		
		return "profile";
	}
}
