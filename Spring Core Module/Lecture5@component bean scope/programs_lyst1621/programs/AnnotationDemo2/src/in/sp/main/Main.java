package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.MyStudent;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(MyStudent.class);
		context.refresh();
		
		MyStudent std = (MyStudent) context.getBean("myStudent");
		std.display();
	}
}