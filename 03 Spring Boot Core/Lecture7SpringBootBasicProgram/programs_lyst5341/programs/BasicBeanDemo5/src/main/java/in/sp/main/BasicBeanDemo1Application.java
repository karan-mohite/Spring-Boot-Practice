package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Student;

@SpringBootApplication
public class BasicBeanDemo1Application
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(BasicBeanDemo1Application.class, args);
		
		Student std1 = (Student) context.getBean("createStdObj1");
		std1.display();
		
		System.out.println("-------------------------");
		
		Student std2 = (Student) context.getBean("createStdObj2");
		std2.display();
	}
}