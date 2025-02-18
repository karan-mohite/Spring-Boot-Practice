package in.sp.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student
{
	private String name;
	private int rollno;
	
	//getter and setter method
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}

	@PostConstruct
	public void initializeStdObj()
	{
		name = "deepak";
		rollno = 111;
	}
	
	@PreDestroy
	public void destroyStdBean()
	{
		System.out.println("destroy method invoked");
		
		name = "";
		rollno = 0;
	}
}