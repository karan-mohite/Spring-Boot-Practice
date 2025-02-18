package in.sp.main;

import in.sp.beans.Address;
import in.sp.beans.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		Address addr = new Address();
		addr.setHouseno(123);
		addr.setCity("Delhi");
		addr.setPincode(12345);
		
		Student std = new Student();
		std.setName("Deepak");
		std.setRollno(111);
		std.setAddress(addr);
		
		std.display();
	}
}