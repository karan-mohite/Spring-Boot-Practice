package in.sp.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController2 
{
//	@GetMapping("/getResult/{rollno1}")
//	public String getStdResult(@PathVariable int rollno1)
//	{
//		System.out.println("Roll No : "+rollno1);
//		
//		// get result from database and return the result
//		
//		return "96.1";
//	}
	
	
	@GetMapping("/getResult/{rollno1}")
	public String getStdResult(@PathVariable("rollno1") int myrollno)
	{
		System.out.println("Roll No : "+myrollno);
		
		// get result from database and return the result
		
		return "97.7";
	}
}