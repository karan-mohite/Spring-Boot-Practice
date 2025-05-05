package in.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "std_marks")
@NamedQueries({
	@NamedQuery(name = "getAllStdDetails", query = "SELECT s FROM Student s"),
	@NamedQuery(name = "getStdDetailsById", query = "SELECT s FROM Student s WHERE s.id = :stdId")
})
public class Student
{
	@Id
	@Column(name = "std_id")
	private int id;
	
	@Column(name = "std_name")
	private String name;
	
	@Column(name = "std_rollno")
	private int rollno;
	
	@Column(name = "std_marks")
	private float marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
}
