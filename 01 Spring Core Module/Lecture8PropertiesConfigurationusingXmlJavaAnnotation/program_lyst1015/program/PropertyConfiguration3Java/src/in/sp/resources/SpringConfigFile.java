package in.sp.resources;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("C", 89);
		map.put("C++", 84);
		map.put("Java", 97);
		map.put("Python", 91);
		std.setSubjmarks(map);
		
		return std;
	}
}
