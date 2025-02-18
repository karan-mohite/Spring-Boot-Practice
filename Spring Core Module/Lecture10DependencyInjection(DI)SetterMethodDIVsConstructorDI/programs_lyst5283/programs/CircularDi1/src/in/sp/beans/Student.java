package in.sp.beans;

public class Student
{
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void studentDisplay()
	{
		System.out.println("im in student class : "+teacher);
	}
}
