package in.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entity.Student;
import in.sp.main.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService stdService;
	
	@PostMapping("/student")
	public Student addStdDetails(@RequestBody Student std)
	{
		return stdService.addStdDetailsService(std);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStdDetails()
	{
		return stdService.getAllStdDetailsService();
	}
	
	@GetMapping("/student/{rollno}")
	public Student getStdDetailsByRollno(@PathVariable int rollno)
	{
		return stdService.getStdDetailsByRollnoService(rollno);
	}
	
	@PutMapping("/student/{rollno}/{marks}")
	public Student updateStdDetails(@PathVariable int rollno, @PathVariable float marks)
	{
		return stdService.updateStdDetailsService(rollno, marks);
	}
	
	@DeleteMapping("/student")
	public String deleteStdDetails(@RequestBody Student std)
	{
		return stdService.deleteStdDetailsService(std);
	}
	
	@DeleteMapping("/student/{rollno}")
	public String deleteStdDetailsByRollno(@PathVariable int rollno)
	{
		return stdService.deleteStdDetailsByRollnoService(rollno);
	}
}