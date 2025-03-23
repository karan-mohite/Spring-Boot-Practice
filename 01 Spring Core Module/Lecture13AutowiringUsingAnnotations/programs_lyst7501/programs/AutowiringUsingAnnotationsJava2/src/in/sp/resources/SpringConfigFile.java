package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile
{
	@Bean
	public Address createAddrObj()
	{
		Address addr = new Address();
		
		addr.setHouseno(123);
		addr.setCity("Delhi");
		addr.setPincode(12345);
		
		return addr;
	}
	
	@Bean
	public Subjects createSubjObj()
	{
		Subjects subj = new Subjects();
		
		List<String> subj_list = new ArrayList<String>();
		subj_list.add("C");
		subj_list.add("C++");
		subj_list.add("Java");
		subj_list.add("Python");
		subj.setMysubjects(subj_list);
		
		return subj;
	}
	
	@Bean
	public Student createStdObj()
	{
		Student std = new Student();
		
		std.setName("Deepak");
		std.setRollno(111);
		//std.setAddress(createAddrObj());		//manually DI
		//std.setSubjects(createSubjObj());
		
		return std;
	}
}
