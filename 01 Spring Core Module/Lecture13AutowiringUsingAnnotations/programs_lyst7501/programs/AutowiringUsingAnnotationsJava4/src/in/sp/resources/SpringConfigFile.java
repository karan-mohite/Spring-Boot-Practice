package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile
{
	@Bean
	public Address createAddrObj1()
	{
		Address addr = new Address();
		
		addr.setHouseno(123);
		addr.setCity("Delhi");
		addr.setPincode(12345);
		
		return addr;
	}
	
	@Bean
	public Address createAddrObj2()
	{
		Address addr = new Address();
		
		addr.setHouseno(567);
		addr.setCity("Mumbai");
		addr.setPincode(56789);
		
		return addr;
	}
	
	@Bean
	public Student createStdObj()
	{
		Student std = new Student();
		
		std.setName("Deepak");
		std.setRollno(111);
		//std.setAddress(createAddrObj());		//manually DI
		
		return std;
	}
}
