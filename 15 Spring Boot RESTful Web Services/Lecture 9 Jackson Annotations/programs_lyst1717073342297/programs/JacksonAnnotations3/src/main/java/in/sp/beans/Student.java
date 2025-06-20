package in.sp.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student
{
	private int rollno;
	private String name;
	
	@JsonIgnore
	private float marks;
	
	@JsonIgnore
	private String university;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
}
