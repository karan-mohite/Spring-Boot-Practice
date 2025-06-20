package in.sp.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student
{
//	@JsonProperty("myrollno")
	private int rollno;
	
	private String name;
	private float marks;
	private String university;
	
//	@JsonProperty("myrollno")
	public int getRollno() {
		return rollno;
	}
	@JsonProperty("myrollno")
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
