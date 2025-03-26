package in.sp.main;

import in.sp.dao.InsertDemo;

public class MainApp
{
	public static void main(String[] args)
	{
		System.out.println("---------Application Started---------");
		
		InsertDemo id = new InsertDemo();
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
