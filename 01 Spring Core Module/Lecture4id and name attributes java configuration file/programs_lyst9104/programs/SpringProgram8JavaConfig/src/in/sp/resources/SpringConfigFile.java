package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile
{
	@Bean(name = "stdObj1")
	public Student createBeanObj()
	{
		Student std = new Student();
		
		std.setName("Deepesh Panwar");
		std.setRollno(444);
		
		return std;
	}
}