package in.sp.beans;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Student
{
	private int rollno;
	private String name;
	
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
	
	//----------add another properties----------------
	private Map<String, Object> otherProperties = new HashMap<String, Object>();
	
	public Map<String, Object> getOtherProperties() {
		return otherProperties;
	}
	@JsonAnySetter
	public void setOtherProperties(String key, Object value)
	{
		otherProperties.put(key, value);
	}
}