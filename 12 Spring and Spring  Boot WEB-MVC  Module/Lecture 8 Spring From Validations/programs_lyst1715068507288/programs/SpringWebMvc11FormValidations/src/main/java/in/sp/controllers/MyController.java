package in.sp.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	
	@PostMapping("/regForm")
	public String handleRegForm(@Valid @ModelAttribute("modelStd") Student std, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "register";
		}
		else
		{
			return "profile";
		}
	}
}
