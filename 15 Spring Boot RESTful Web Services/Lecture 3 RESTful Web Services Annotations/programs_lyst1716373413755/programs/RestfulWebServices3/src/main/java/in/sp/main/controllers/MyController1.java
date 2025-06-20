package in.sp.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController1 
{
	@GetMapping("/processText")
	public String getRawData(@RequestBody String rawText)
	{
		return "Raw Text :: "+rawText;
	}
}