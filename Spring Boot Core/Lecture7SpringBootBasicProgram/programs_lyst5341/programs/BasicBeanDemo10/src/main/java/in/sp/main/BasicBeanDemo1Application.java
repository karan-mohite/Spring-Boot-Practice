package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.test.Test;

@SpringBootApplication
public class BasicBeanDemo1Application
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(BasicBeanDemo1Application.class, args);
		
		Test test = context.getBean(Test.class);
		test.m1();
	}
}