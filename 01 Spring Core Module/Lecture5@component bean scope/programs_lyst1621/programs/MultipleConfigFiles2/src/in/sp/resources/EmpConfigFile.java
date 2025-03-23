package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Employee;

@Configuration
public class EmpConfigFile
{
	@Bean
	public Employee empObj()
	{
		Employee emp = new Employee();
		
		emp.setEmpname("Deepesh");
		emp.setEmpid(222);
		
		return emp;
	}
}
