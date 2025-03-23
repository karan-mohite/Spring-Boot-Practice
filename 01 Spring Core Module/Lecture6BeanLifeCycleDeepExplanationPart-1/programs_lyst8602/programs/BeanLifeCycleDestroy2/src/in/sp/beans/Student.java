package in.sp.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean
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

	@Override
	public void destroy() throws Exception 
	{
		System.out.println("destroy method invoked");
		
		name = "";
		rollno = 0;
	}
}