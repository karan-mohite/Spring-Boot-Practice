package in.sp.main.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entities.Orders;
import in.sp.main.services.OrderService;

@RestController
@RequestMapping("/api")
public class OrdersApi
{
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/storeOrderDetails")
	public ResponseEntity<String> storeUserOrdersDetails(@RequestBody Orders orders)
	{
		orderService.storeUserOrders(orders);
		return ResponseEntity.ok("Order details stored successfully");
	}
}