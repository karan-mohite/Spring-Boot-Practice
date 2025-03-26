package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Employee;
import in.sp.main.repository.DbOperations;

@SpringBootApplication
public class SpringbootWithHibernate1Application
{
	public static void main(String[] args) 
	{		
		ApplicationContext context = SpringApplication.run(SpringbootWithHibernate1Application.class, args);
		
		Employee emp = new Employee();
		emp.setEmpid(1);
		emp.setEmpname("deepak");
		emp.setEmpdept("java developer");
		emp.setEmpsalary(100000);
		
		DbOperations dbop = context.getBean(DbOperations.class);
		boolean status = dbop.saveEmployee(emp);
		if(status)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
	}
}