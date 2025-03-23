package in.sp.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp2 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------Application Started---------------");
		
		Logger logger = Logger.getLogger(MainApp2.class.getName());
		
		logger.setLevel(Level.SEVERE);
		
		logger.log(Level.SEVERE, "Server is not responding");
		logger.log(Level.WARNING, "3 Invalid login attempts");
		logger.log(Level.INFO, "Order placed successfully");
		
		
		System.out.println("-----------Application Finished---------------");
	}
}