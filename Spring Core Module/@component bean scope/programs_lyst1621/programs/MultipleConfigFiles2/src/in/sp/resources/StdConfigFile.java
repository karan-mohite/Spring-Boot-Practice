package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class StdConfigFile
{
	@Bean
	public Student stdObj()
	{
		Student std = new Student();
		
		std.setName("Kamal");
		std.setRollno("102");
		
		return std;
	}
}
