package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/myproject")
public class MyController 
{
//	@RequestMapping("/aaa")
//	public void aaa()
//	{
//		//--------body---------
//	}
	
	
	
//	@RequestMapping("/aaa")
//	public String openHelloPage()
//	{
//		return "hello";
//	}
	
	
//	@RequestMapping("/aaa")
//	public ModelAndView openHelloPage()
//	{
//		ModelAndView mav = new ModelAndView();
//		// set model data
//		// set view name
//		return mav;
//	}
	
	
//	@RequestMapping("/aaa")
//	public ModelAndView openHelloPage()
//	{
//		ModelAndView mav = new ModelAndView();
//		// set model data
//		// set view name
//		return mav;
//	}
	
	
//	@RequestMapping("/aaa")
//	public String openHelloPage(int a)
//	{
//		return "hello";
//	}
	
	
//	@RequestMapping("/aaa")
//	public String openHelloPage(String name)
//	{
//		return "hello";
//	}
	
	
//	@RequestMapping("/aaa")
//	public String openHelloPage(HttpServletRequest request, HttpServletResponse response)
//	{
//		return "hello";
//	}
	
	
//	//@RequestMapping(value = "/aaa")
//	//@RequestMapping(value = {"/aaa", "/bbb", "/ccc"})
//	//@RequestMapping(value = "/aaa", method = RequestMethod.GET)
//	@RequestMapping(value = "/aaa", method = {RequestMethod.GET, RequestMethod.POST})
//	public String openHelloPage()
//	{
//		return "hello";
//	}
	
	
	
//	@GetMapping("/aaa")
//	public String openHelloPage()
//	{
//		return "hello";
//	}
	
	
	
	@PostMapping("/aaa")
	public String openHelloPage()
	{
		return "hello";
	}
}
