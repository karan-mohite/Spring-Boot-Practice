package in.sp.main;

import in.sp.beans.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		Student stdObj = new Student();
		
		stdObj.setName("deepak");
		stdObj.setRollno(101);
		
		stdObj.display();
	}
}