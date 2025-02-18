package in.sp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Student implements BeanFactoryAware
{
	private String name;
	private int rollno;
	private Address address;
	
	private BeanFactory beanFactory;
	
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
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException 
	{
		this.beanFactory=beanFactory;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno. : "+rollno);
		
		Address address = (Address) beanFactory.getBean("addrObj");
		System.out.println("Address : "+address);
	}
}
