package in.sp.beans;

public class Student
{
	private String name;
	private String rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	public void stdDisplay()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
	}
}
