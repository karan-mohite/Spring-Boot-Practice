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
		name = "Deepak";
		rollno = 111;
	}
}