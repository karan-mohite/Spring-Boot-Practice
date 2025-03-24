package in.sp.main.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class SecurityAspect
{
	@Before("execution(* in.sp.main.services.TransactionService.*())")
	public void mySecurity()
	{
		System.out.println("---- security code -----");
	}
}