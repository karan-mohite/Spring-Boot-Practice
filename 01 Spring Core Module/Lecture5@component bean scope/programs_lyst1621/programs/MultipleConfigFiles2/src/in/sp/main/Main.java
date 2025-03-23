package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Employee;
import in.sp.beans.Student;
import in.sp.resources.EmpConfigFile;
import in.sp.resources.StdConfigFile;

public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(
				StdConfigFile.class,
				EmpConfigFile.class);
		
		Student std = (Student) context.getBean("stdObj");
		std.stdDisplay();
		
		System.out.println("-----------------------------------");
		
		Employee emp = (Employee) context.getBean("empObj");
		emp.empDisplay();
	}
}