package in.sp.main;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp3 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------Application Started---------------");
		
		try
		{
			FileHandler fileHandler = new FileHandler("d:\\mylogdetails.log");
			
			Logger logger = Logger.getLogger(MainApp3.class.getName());
			logger.addHandler(fileHandler);
			
			logger.log(Level.SEVERE, "Server is not responding");
			logger.log(Level.WARNING, "3 Invalid login attempts");
			logger.log(Level.INFO, "Order placed successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("-----------Application Finished---------------");
	}
}