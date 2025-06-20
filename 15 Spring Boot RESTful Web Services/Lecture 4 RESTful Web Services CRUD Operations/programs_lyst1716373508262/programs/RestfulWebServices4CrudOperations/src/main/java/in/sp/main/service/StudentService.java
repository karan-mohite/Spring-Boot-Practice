package in.sp.main.service;

import java.util.List;

import in.sp.main.entity.Student;

public interface StudentService
{
	public Student addStdDetailsService(Student std);
	
	public List<Student> getAllStdDetailsService();
	public Student getStdDetailsByRollnoService(int rollno);
	
	public Student updateStdDetailsService(int rollno, float marks);
	
	public String deleteStdDetailsService(Student std);
	public String deleteStdDetailsByRollnoService(int rollno);
}