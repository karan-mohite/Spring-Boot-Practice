package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile
{
	@Bean("stdId")
	public Student createStdObject()
	{
		Student std = new Student();
		
		std.setName("Deepesh");
		std.setRollno(222);
		
		return std;
	}
}
