package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"m_name", "m_gender", "m_city"})
public class MyController 
{
	@GetMapping("/aaa")
	public String openFirstPage(Model model)
	{
		//100 lines of code
		String name = "Deepak";
		String gender = "Male";
		String city = "Chandigarh";
		
		model.addAttribute("m_name", name);
		model.addAttribute("m_gender", gender);
		model.addAttribute("m_city", city);
		
		return "first";
	}
	
	@GetMapping("/bbb")
	public String openSecondPage()
	{
		return "second";
	}
}
