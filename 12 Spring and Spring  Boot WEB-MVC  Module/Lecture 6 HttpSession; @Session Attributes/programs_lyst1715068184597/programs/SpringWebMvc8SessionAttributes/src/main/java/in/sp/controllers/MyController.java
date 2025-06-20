package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("m_name")
public class MyController 
{
	@GetMapping("/aaa")
	public String openFirstPage(Model model)
	{
		//100 lines of code
		String name = "Deepak";
		
		model.addAttribute("m_name", name);
		
		return "first";
	}
	
	@GetMapping("/bbb")
	public String openSecondPage()
	{
		return "second";
	}
	
	@GetMapping("/ccc")
	public String openThirdPage(SessionStatus sessionStatus)
	{
		sessionStatus.setComplete();
		
		return "third";
	}
	
	@GetMapping("/ddd")
	public String openFourthPage()
	{
		return "fourth";
	}
}
