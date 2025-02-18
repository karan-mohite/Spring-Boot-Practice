package in.sp.beans;

public class Student
{
	public Student()
	{
		System.out.println("constructor invoked");
	}
	
	private String name;
	private int rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display()
	{
		System.out.println("method invoked");
		//System.out.println("Name : "+name);
		//System.out.println("Rollno : "+rollno);
	}
}
