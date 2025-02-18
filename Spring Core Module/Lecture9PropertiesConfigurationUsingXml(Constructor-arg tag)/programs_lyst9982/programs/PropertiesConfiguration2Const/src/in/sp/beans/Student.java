package in.sp.beans;

public class Student 
{
	private String name;
	private int rollno;
	private float marks;
	
	public Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	public Student(String name, int rollno, float marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	//getter and setter methods
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Marks : "+marks);
	}
}
