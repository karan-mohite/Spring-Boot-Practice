package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.dbcon.DbConnection;

@SpringBootApplication
public class SpringBootJdbcCon1Application
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringBootJdbcCon1Application.class, args);
		
		DbConnection dbcon = context.getBean(DbConnection.class);
		dbcon.checkDbConnection();
	}
}