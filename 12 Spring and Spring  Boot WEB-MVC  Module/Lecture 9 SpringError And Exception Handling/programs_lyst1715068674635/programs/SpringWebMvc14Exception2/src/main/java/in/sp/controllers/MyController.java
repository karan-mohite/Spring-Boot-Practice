package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.exceptions.LessAgeException;

@Controller
public class MyController 
{
	@GetMapping("/openVotingPage")
	public String openVotingPage()
	{
		return "voting-page";
	}
	
	@PostMapping("/votingForm")
	public String votingForm(HttpServletRequest req)
	{
		String page;
		
		String myage = req.getParameter("age1");
		int myage1 = Integer.parseInt(myage);
		
		if(myage1 < 18)
		{
			throw new LessAgeException("Sorry, you cannot vote as your age is below 18");
		}
		else
		{
			page = "success";
		}
		
		return page;
	}
	
	@ExceptionHandler(LessAgeException.class)
	public String openErrorPage()
	{
		return "fail";
	}
}