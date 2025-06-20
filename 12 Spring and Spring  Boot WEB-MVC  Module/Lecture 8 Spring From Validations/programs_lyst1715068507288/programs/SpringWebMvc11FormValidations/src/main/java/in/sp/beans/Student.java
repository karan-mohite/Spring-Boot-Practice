package in.sp.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student
{
	//@NotEmpty
	@NotEmpty(message = "Name should not be empty")
	@Size(min = 3, max = 15, message = "Name should be of length 3 to 15 characters")
	private String name;
	
	@NotEmpty(message = "Email id should not be empty")
	@Email(message =  "Email id is not valid")
	private String email;
	
//	@Min(value = 3)
//	@Max(value = 15)
//	@NotEmpty(message = "Password should not be empty")
//	@Size(min = 3, max = 15, message = "Password should be of length 3 to 15 characters")
	@Pattern(regexp = "^[a-zA-Z0-9@]{3,15}$", message =  "Password is not properly formatted")
	private String password;
	
	@NotEmpty(message = "Please select the gender")
	private String gender;
	
	@NotEmpty(message =  "Please select the city")
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
