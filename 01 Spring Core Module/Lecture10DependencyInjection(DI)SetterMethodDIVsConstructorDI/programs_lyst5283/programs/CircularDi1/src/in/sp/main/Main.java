package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.beans.Teacher;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdId");
		std.studentDisplay();
		
		System.out.println("--------------------------");
		
		Teacher tch = (Teacher) context.getBean("teachId");
		tch.teacherDisplay();
	}
}