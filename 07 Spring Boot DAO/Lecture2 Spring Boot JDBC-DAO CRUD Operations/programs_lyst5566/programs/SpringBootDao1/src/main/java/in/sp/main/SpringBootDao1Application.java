package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.dao.CrudOperations;
import in.sp.main.dao.CrudOperationsImpl;

@SpringBootApplication
public class SpringBootDao1Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringBootDao1Application.class, args);
		
		CrudOperations cuCrudOperations = context.getBean(CrudOperationsImpl.class);
		
		String item_id1 = "101";
		String item_name1 = "T-Shirt";
		String item_price1 = "500";
		
		boolean status = cuCrudOperations.insertValues(item_id1, item_name1, item_price1);
		if(status)
		{
			System.out.println("insertion success");
		}
		else
		{
			System.out.println("insertion failed");
		}
	}
}