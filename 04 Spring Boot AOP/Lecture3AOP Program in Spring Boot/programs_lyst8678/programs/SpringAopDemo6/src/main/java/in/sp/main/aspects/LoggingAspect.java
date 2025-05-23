package in.sp.main.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Around("execution(* in.sp.main.services.TransactionService.*(..))")
	public void loggingBefore(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("---- logging code (before) -----");
		
		joinPoint.proceed();
		
		System.out.println("---- logging code (after) -----");
	}
}