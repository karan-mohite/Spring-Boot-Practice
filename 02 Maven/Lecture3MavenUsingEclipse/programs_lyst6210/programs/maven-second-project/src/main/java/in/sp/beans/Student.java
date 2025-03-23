package in.sp.beans;

public class Student
{
	private String name;
	private int rollno;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno. : "+rollno);
	}
}
