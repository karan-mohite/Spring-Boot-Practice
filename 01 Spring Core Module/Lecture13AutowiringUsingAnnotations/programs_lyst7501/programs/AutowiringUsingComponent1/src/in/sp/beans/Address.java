package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address
{
	private int houseno;
	private String city;
	private int pincode;
	
	public Address(@Value("123") int houseno, @Value("Delhi") String city, @Value("12345") int pincode)
	{
		this.houseno=houseno;
		this.city=city;
		this.pincode=pincode;
	}
	
	@Override
	public String toString() 
	{
		return "#"+houseno+", "+city+" - "+pincode;
	}
}
