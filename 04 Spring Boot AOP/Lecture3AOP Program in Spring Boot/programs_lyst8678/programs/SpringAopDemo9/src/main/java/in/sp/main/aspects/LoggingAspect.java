package in.sp.main.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect 
{
	@Before("execution(* in.sp.main.services.*.*(..))")
	public void logging()
	{
		System.out.println("---- logging code -----");
	}
}