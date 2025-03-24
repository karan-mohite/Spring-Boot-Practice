package in.sp.main.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect 
{
	@Before("execution(* in.sp.main.services.TransactionService.*(..))")
	public void logging()
	{
		System.out.println("---- logging code -----");
	}
}