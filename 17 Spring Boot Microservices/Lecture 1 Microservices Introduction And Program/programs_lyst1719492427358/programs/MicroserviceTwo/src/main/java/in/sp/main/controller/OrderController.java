package in.sp.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{
	@GetMapping("/orders")
	public String getOrders()
	{
		//in real world projects we will get the orders from database
		return "Order-1, Order-2, Order-3";
	}
}