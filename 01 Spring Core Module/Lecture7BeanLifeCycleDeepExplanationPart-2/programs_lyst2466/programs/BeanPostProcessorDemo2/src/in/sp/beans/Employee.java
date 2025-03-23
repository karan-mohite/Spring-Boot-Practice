package in.sp.beans;

public class Employee
{
	private String name;
	private String phoneno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone No. : "+phoneno);
	}
}
