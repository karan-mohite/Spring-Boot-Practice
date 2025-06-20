package in.sp.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entity.User;

@RestController
@RequestMapping("/myapi")
public class MyController3
{
	@GetMapping("/getUser")
	public User getRawJsonData(@RequestBody User user)
	{
		return user;
	}
}