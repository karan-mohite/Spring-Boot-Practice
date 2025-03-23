package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import in.sp.main.beans.Student;

@SpringBootApplication
@ImportResource("classpath:in/sp/main/resources/applicationContext.xml")
public class BasicBeanDemo1Application
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(BasicBeanDemo1Application.class, args);
		
		Student std1 = (Student) context.getBean("stdObj1");
		std1.display();
		
		System.out.println("-------------------------");
		
		Student std2 = (Student) context.getBean("stdObj2");
		std2.display();
	}
}