package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.dao.InsertDemo;

@SpringBootApplication
public class NpJdbcTemplate1Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(NpJdbcTemplate1Application.class, args);
		InsertDemo id = context.getBean(InsertDemo.class);
		id.insertOperation();
	}
}