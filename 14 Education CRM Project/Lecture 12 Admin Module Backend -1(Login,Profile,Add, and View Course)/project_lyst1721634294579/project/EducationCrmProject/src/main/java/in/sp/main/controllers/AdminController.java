package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import in.sp.main.entities.Course;
import in.sp.main.services.CourseService;

@Controller
public class AdminController 
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/adminLogin")
	public String openAdminLoginPage()
	{
		return "admin-login";
	}
	
	@PostMapping("/adminLoginForm")
	public String adminLoginForm(@RequestParam("adminemail") String aemail, @RequestParam("adminpass") String apass, Model model)
	{
		if(aemail.equals("admin@gmail.com") && apass.equals("admin123"))
		{
			return "admin-profile";
		}
		else
		{
			model.addAttribute("errorMsg", "Invalid email id or password");
			return "admin-login";
		}
	}
	
	@GetMapping("/adminProfile")
	public String openAdminProfilePage()
	{
		return "admin-profile";
	}
	
	@GetMapping("/courseManagement")
	public String openCourseManagementPage(Model model)
	{
		List<Course> coursesList = courseService.getAllCourseDetails();
		
		model.addAttribute("coursesList", coursesList);
		
		return "course-management";
	}
	
	@GetMapping("/addCourse")
	public String openAddCoursePage(Model model)
	{
		model.addAttribute("course", new Course());
		return "add-course";
	}
	
	@PostMapping("/addCourseForm")
	public String addCourseForm(@ModelAttribute("course") Course course, @RequestParam("courseImg") MultipartFile courseImg, Model model)
	{
		try
		{
			courseService.addCourse(course, courseImg);
			model.addAttribute("successMsg", "Course added successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			model.addAttribute("errorMsg", "Course not added due to some error");
		}
		return "add-course";
	}
}
