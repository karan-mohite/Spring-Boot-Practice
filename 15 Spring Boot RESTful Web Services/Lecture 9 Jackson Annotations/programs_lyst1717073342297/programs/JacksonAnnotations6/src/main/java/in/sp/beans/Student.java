package in.sp.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student
{
	private int rollno;
	private String name;
	private float marks;
	private String university;
	
//	@JsonFormat(pattern = "dd/MM/yyyy" )
//	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss" )
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", timezone = "Asia/Kolkata" )
	private Date adimissionDate;
	
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
	public Date getAdimissionDate() {
		return adimissionDate;
	}
	public void setAdimissionDate(Date adimissionDate) {
		this.adimissionDate = adimissionDate;
	}
}
