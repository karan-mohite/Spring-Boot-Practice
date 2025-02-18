package in.sp.beans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	@Value("Kamal Sharma")
	private String name;
	
	@Value("444")
	private int rollno;
	
	@Value("#{${subjmarks : {'C': 87, 'C++':83, 'Java': 98, 'Python':91}}}")
	private Map<String, Integer> subjmarks;
	
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
	
	public Map<String, Integer> getSubjmarks() {
		return subjmarks;
	}
	public void setSubjmarks(Map<String, Integer> subjmarks) {
		this.subjmarks = subjmarks;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Subjects & Marks : "+subjmarks);
	}
}
