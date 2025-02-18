package in.sp.beans;

import javax.annotation.PostConstruct;

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
}