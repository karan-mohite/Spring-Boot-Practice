package in.sp.beans;

public class Employee
{
	private String empname;
	private int empid;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void empDisplay()
	{
		System.out.println("Emp Name : "+empname);
		System.out.println("Emp Id. : "+empid);
	}
}
