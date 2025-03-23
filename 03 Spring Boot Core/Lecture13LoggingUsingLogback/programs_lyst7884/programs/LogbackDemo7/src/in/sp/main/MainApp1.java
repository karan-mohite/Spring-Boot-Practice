package in.sp.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("----------Application Started-----------");
		
		System.setProperty("logback.configurationFile", "in/sp/resources/logback.xml");
		
		Logger logger = LoggerFactory.getLogger(MainApp1.class);
		
		logger.debug("This is debug message....");
		logger.info("This is info message....");
		logger.warn("This is warn message....");
		logger.error("This is error message....");
		
		System.out.println("----------Application Finished-----------");
	}
}