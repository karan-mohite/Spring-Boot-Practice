package in.sp.beans;

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
	
	public void initializeStdObj()
	{
		System.out.println("custom init method invoked");
		
		name = "Deepak";
		rollno = 111;
	}
	
	public void destroyStdObj()
	{
		System.out.println("custom destroy method invoked");
		
		name = "";
		rollno = 0;
	}
}