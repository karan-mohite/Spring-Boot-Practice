package in.sp.beans;

public class Student
{
	private Teacher teacher;

	public Student(Teacher teacher)
	{
		this.teacher = teacher;
	}
	
	public void studentDisplay()
	{
		System.out.println("im in student class : "+teacher);
	}
}
