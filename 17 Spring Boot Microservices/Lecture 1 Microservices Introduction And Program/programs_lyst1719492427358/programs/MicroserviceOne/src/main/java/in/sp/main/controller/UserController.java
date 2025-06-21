package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController
{
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user")
	public String getUserOrders()
	{
		String str = restTemplate.getForObject("http://localhost:8082/orders", String.class);
		return "User Order : "+str;
	}
}