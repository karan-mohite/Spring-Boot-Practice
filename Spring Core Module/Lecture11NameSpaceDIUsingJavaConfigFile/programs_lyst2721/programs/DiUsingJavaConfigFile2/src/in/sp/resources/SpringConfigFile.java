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
		Address addr = new Address(123, "Noida", 34567);
		return addr;
	}
	
	@Bean("stdId")
	public Student createStdObj()
	{
		return new Student("Kamal", 666, 92.2f, createAddrObj());
	}
}