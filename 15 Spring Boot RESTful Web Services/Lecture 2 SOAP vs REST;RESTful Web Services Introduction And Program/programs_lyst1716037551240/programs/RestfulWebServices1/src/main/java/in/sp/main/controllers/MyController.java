package in.sp.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@GetMapping("/")
	public String getMessage()
	{
		return "Hello Smart Programming";
	}
	
	@PostMapping("/")
	public String getSecondMesg()
	{
		return "Hello Deepak Sir";
	}
}