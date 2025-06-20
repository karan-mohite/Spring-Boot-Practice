package in.sp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entity.Student;
import in.sp.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository stdRepository;
	
	@Override
	public Student addStdDetailsService(Student std) 
	{
		return stdRepository.save(std);
	}

	@Override
	public List<Student> getAllStdDetailsService() 
	{
		return stdRepository.findAll();
	}

	@Override
	public Student getStdDetailsByRollnoService(int rollno) 
	{
		return stdRepository.findByRollno(rollno);
	}

	@Override
	public Student updateStdDetailsService(int rollno, float marks)
	{
		Student std = stdRepository.findByRollno(rollno);
		std.setMarks(marks);
		
		return stdRepository.save(std);
	}

	@Override
	public String deleteStdDetailsService(Student std)
	{
		try
		{
//			System.out.println(std.getId());
//			System.out.println(std.getName());
//			System.out.println(std.getRollno());
			
			stdRepository.delete(std);
			return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String deleteStdDetailsByRollnoService(int rollno)
	{
		try
		{
			stdRepository.deleteByRollno(rollno);
			return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
	}
}