package in.sp.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Items;
import in.sp.main.dao.CrudOperations;
import in.sp.main.dao.CrudOperationsImpl;
import in.sp.main.service.DbService;
import in.sp.main.service.DbServiceImpl;

@SpringBootApplication
public class SpringBootDao1Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringBootDao1Application.class, args);
		
		DbService dbService = context.getBean(DbServiceImpl.class);
		
		//---------insertion-----------------------
//		String item_id1 = "103";
//		String item_name1 = "Shirt";
//		String item_price1 = "800";
//		
//		boolean status = dbService.insertService(item_id1, item_name1, item_price1);
//		if(status)
//		{
//			System.out.println("insertion success");
//		}
//		else
//		{
//			System.out.println("insertion failed");
//		}
		
		
		
		//---------updation------------------
//		String item_id1 = "101";
//		String item_price1 = "550";
//		
//		boolean status = dbService.updateService(item_id1, item_price1);
//		if(status)
//		{
//			System.out.println("updation success");
//		}
//		else
//		{
//			System.out.println("updation failed");
//		}
		
		
		
		//----------deletion---------------
//		String item_id1 = "101";
//		
//		boolean status = dbService.deleteService(item_id1);
//		if(status)
//		{
//			System.out.println("deletion success");
//		}
//		else
//		{
//			System.out.println("deletion failed");
//		}
		
		
		
		//------------select all items-----------------
//		List<Items> items_list = dbService.getAllItemsService();
//		for(Items item : items_list)
//		{
//			System.out.println(item.getItemid()+" - "+item.getItemname()+" - "+item.getItemprice());
//			System.out.println("-------------------------------");
//		}
		
		
		
		//--------select one item------------
		String item_id = "102";
		Items item = dbService.getItemDetails(item_id);
		System.out.println(item.getItemid()+" - "+item.getItemname()+" - "+item.getItemprice());
	}
}