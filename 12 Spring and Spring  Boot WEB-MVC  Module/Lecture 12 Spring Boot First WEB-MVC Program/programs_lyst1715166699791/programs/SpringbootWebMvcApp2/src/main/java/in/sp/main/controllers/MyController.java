package in.sp.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController 
{
	@PostMapping("/submitForm")
	public String handleForm(@RequestParam("name1") String myname, Model model)
	{
		System.out.println("Name : "+myname);
		
		model.addAttribute("model_name", myname);
		
		return "profile";
	}
}