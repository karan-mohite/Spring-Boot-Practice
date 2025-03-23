package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Student;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class BasicBeanDemo1Application
{
	@Autowired
	private Student student;
	
	public static void main(String[] args)
	{
		SpringApplication.run(BasicBeanDemo1Application.class, args);
	}
	
	@PostConstruct
	public void m1()
	{
		student.display();
	}
}