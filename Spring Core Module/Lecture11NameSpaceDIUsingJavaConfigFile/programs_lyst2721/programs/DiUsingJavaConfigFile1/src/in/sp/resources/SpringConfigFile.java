package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Address createAddrObj()
	{
		Address addr = new Address();
		
		addr.setHouseno(123);
		addr.setCity("Faridabad");
		addr.setPincode(56789);
		
		return addr;
	}
	
	@Bean("stdId")
	public Student createStdObj()
	{
		Student std = new Student();
		
		std.setName("Amit");
		std.setRollno(333);
		std.setMarks(93.1f);
		std.setAddress(createAddrObj());
		
		return std;
	}
}