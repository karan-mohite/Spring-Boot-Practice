package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{
	@RequestMapping("/aaa")
	public String openHelloPage()
	{
		return "hello";
	}
	
	
//	@PostMapping("/myForm")
//	public String getFormName(HttpServletRequest req, HttpServletResponse resp)
//	{
//		String myname = req.getParameter("name1");
//		System.out.println("Name : "+myname);
//		
//		return "hello";
//	}
	
	
//	@PostMapping("/myForm")
//	public String getFormName(HttpServletRequest req, HttpServletResponse resp, Model model)
//	{
//		String myname = req.getParameter("name1");
//		
//		model.addAttribute("model_name", myname);
//		
//		return "hello";
//	}
	
	
//	@PostMapping("/myForm")
//	public ModelAndView getFormName(HttpServletRequest req, HttpServletResponse resp)
//	{
//		String myname = req.getParameter("name1");
//		
//		ModelAndView mav = new ModelAndView();
//		
//		mav.addObject("mav_name", myname);
//		mav.setViewName("hello");
//		
//		return mav;
//	}
	
	
	
	@PostMapping("/myForm")
	public ModelAndView getFormName(HttpServletRequest req, HttpServletResponse resp)
	{
		String myname = req.getParameter("name1");
		
		ModelAndView mav = new ModelAndView("hello", "mav_name", myname);
		
		return mav;
	}
}
