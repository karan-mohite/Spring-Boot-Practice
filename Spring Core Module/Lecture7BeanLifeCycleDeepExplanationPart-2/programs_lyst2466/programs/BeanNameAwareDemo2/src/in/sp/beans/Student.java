package in.sp.beans;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware
{
	private String name;
	private int rollno;
	private String beanName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name setter method invoked");
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
		System.out.println("Name : "+name);
		System.out.println("Rollno. : "+rollno);
		System.out.println("Bean Name : "+beanName);
	}
	
	@Override
	public void setBeanName(String beanName)
	{
		System.out.println("beannameaware method invoked");
		this.beanName=beanName;
	}
}
