package in.sp.main.services;

import org.springframework.stereotype.Service;

@Service
public class MyService
{
	public void myServiceMethod1()
	{
		System.out.println("===== business logic for myServiceMethod1() =====");
	}
	
	public void myServiceMethod2()
	{
		System.out.println("===== business logic for myServiceMethod2() =====");
	}
}
