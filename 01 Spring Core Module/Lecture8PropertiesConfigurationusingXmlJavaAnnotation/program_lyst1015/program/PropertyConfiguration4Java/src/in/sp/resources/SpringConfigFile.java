package in.sp.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import in.sp.beans.Student;

@Configuration
@PropertySource("/in/sp/resources/student.properties")
public class SpringConfigFile
{
	@Value("${student.name}")
	private String name;
	
	@Value("${student.rollno}")
	private int rollno;
	
	@Bean("stdId")
	public Student createStdObject()
	{
		Student std = new Student();
		
		std.setName(name);
		std.setRollno(rollno);
		
		return std;
	}
}
