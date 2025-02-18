package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.JavaConfigFile;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
		Student std = (Student) context.getBean("student");
		std.display();
	}
}