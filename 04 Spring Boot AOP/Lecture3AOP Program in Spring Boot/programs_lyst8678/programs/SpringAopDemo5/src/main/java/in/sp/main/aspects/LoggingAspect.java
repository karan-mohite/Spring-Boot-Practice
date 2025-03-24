package in.sp.main.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("execution(* in.sp.main.services.TransactionService.*(..))")
	public void loggingBefore()
	{
		m1();
	}
	
	@After("execution(* in.sp.main.services.TransactionService.*(..))")
	public void loggingAfter()
	{
		m1();
	}
	
	void m1()
	{
		System.out.println("---- logging code -----");
	}
}