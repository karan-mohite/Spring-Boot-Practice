package in.sp.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements ApplicationContextAware
{
	private String name;
	private int rollno;
	private Address address;
	
	private ApplicationContext applicationContext;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno. : "+rollno);
		
		Address address = (Address) applicationContext.getBean("addrObj");
		System.out.println("Address : "+address);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		this.applicationContext=applicationContext;
	}
}
