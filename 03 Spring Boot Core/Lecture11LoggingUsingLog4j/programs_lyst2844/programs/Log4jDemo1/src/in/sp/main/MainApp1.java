package in.sp.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp1
{
	public static void main(String[] args)
	{
		//Thread.currentThread().setName("deepak-thread");
		
		System.out.println("----------Application Started------------");
		
		Logger logger = LogManager.getLogger(MainApp1.class);
		
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		
		System.out.println("----------Application Stopped------------");
	}
}