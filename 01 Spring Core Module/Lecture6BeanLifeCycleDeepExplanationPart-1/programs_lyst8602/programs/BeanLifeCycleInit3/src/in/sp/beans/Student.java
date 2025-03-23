package in.sp.beans;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean
{
	private String name;
	private int rollno;
	
	//getter and setter method
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		name = "Deepak";
		rollno = 111;
	}
}