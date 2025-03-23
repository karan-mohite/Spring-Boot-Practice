package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean("stdId")
	public Student createStdBean()
	{
		Student std = new Student();
		
		std.setName("Deepesh");
		std.setRollno(102);
		
		return std;
	}
}
