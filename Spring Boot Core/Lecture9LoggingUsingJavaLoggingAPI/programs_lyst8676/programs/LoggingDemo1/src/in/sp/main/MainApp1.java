package in.sp.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------Application Started---------------");
		
		Logger logger = Logger.getLogger(MainApp1.class.getName());
		
		logger.log(Level.SEVERE, "Server is not responding");
		logger.log(Level.WARNING, "3 Invalid login attempts");
		logger.log(Level.INFO, "Order placed successfully");
		
		
		System.out.println("-----------Application Finished---------------");
	}
}