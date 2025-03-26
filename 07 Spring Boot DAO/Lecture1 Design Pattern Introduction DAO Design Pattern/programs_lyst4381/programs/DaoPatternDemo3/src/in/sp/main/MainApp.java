package in.sp.main;

import in.sp.dao.InsertDemo;
import in.sp.dao.InsertDemoImpl;

public class MainApp
{
	public static void main(String[] args)
	{
		System.out.println("---------Application Started---------");
		
		InsertDemo id = new InsertDemoImpl();
		boolean status = id.insertValues();
		if(status)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
		System.out.println("---------Application Finished---------");
	}
}
