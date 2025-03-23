package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address
{
	@Value("123")
	private int houseno;
	
	@Value("Delhi")
	private String city;
	
	@Value("12345")
	private int pincode;
	
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() 
	{
		return "#"+houseno+", "+city+" - "+pincode;
	}
}
