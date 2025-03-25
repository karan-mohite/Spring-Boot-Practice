package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.dao.SelectDemo;

@SpringBootApplication
public class SpringBootJdbcCrud6SelectApplication 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringBootJdbcCrud6SelectApplication.class, args);
		SelectDemo sd = context.getBean(SelectDemo.class);
		sd.selectOperation();
	}
}