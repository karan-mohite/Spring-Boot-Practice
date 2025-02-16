package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile
{
	@Bean(name = "stdObj1")
	public Student createBeanObj1()
	{
		Student std = new Student();
		
		std.setName("Deepesh Panwar");
		std.setRollno(444);
		
		return std;
	}
	
	@Bean(name = "stdObj2")
	public Student createBeanObj2()
	{
		Student std = new Student();
		
		std.setName("Kamal Sharma");
		std.setRollno(555);
		
		return std;
	}
}