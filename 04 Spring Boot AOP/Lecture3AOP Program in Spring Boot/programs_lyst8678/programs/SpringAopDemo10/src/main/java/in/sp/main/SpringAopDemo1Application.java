package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.services.MyService;
import in.sp.main.services.TransactionService;

@SpringBootApplication
public class SpringAopDemo1Application
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringAopDemo1Application.class, args);
		
		System.out.println();
		
		TransactionService transactionService = context.getBean(TransactionService.class);
		
		transactionService.upiTransaction();
		System.out.println();
		transactionService.internetBankingTransaction();
		System.out.println();
		transactionService.mobileBankingTransaction();
		System.out.println();
		
		MyService myService = context.getBean(MyService.class);
		
		myService.myServiceMethod1();
		System.out.println();
		myService.myServiceMethod2();
	}
}