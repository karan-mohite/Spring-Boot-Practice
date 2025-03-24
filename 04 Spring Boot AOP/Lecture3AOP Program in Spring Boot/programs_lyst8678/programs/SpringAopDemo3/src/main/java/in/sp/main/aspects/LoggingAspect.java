package in.sp.main.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("execution(* in.sp.main.services.TransactionService.*())")
	public void loggingBefore()
	{
		System.out.println("---- logging code (before) -----");
	}
	
	@After("execution(* in.sp.main.services.TransactionService.upiTransaction()) || "
			+ "execution(* in.sp.main.services.TransactionService.walletTransaction())")
	public void loggingAfter()
	{
		System.out.println("---- logging code (after) -----");
	}
}