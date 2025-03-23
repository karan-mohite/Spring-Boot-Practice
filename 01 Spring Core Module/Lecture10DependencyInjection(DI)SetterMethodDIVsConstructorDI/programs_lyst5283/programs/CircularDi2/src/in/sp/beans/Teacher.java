package in.sp.beans;

public class Teacher 
{
	public Student student;

	public Teacher(Student student)
	{
		this.student = student;
	}
	
	public void teacherDisplay()
	{
		System.out.println("im in teacher class : "+student);
	}
}
