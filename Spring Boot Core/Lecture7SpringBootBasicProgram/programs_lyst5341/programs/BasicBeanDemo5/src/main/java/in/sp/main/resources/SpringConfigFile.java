package in.sp.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class SpringConfigFile
{
    @Bean
    Student createStdObj1()
	{
		Student std = new Student();
		
		std.setName("Amit");
		std.setRollno(102);
		
		return std;
	}
    
    @Bean
    Student createStdObj2()
	{
		Student std = new Student();
		
		std.setName("Kamal");
		std.setRollno(103);
		
		return std;
	}
}