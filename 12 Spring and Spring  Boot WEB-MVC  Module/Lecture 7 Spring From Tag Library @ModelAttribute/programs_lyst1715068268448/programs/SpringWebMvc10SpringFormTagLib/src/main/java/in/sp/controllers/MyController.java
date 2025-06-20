package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.beans.Student;

@Controller
public class MyController
{
	@GetMapping("/regPage")
	public String openRegPage(Model model)
	{
		model.addAttribute("modelStd", new Student());
		return "register";
	}
	
	
	
//	@PostMapping("/regForm")
//	public String handleRegForm(Student std, Model model)
//	{
//		// insert into database code
//		
//		model.addAttribute("model_std", std);
//		
//		return "profile";
//	}
	
	
	@PostMapping("/regForm")
	public String handleRegForm(@ModelAttribute("model_std") Student std)
	{
		// insert into database code
		
		return "profile";
	}
	
	
	
	
//	@ModelAttribute
//	public void addStdObject(Model model, Student std)
//	{
//		model.addAttribute("model_std", std);
//	}
//	
//	@PostMapping("/regForm")
//	public String handleRegForm()
//	{
//		// insert into database code
//		
//		return "profile";
//	}
}
