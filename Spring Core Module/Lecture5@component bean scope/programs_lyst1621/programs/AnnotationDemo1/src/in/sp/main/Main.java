package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(Student.class);
		context.refresh();
		
		Student std = (Student) context.getBean("student");
		std.display();
	}
}