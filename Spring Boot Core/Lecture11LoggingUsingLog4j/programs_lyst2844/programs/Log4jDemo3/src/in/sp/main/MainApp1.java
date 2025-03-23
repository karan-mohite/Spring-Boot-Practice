package in.sp.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class MainApp1
{
	public static void main(String[] args)
	{
		System.out.println("----------Application Started------------");
		
		Configurator.initialize(null, "classpath:in/sp/resources/log4j2.properties");
		
		Logger logger = LogManager.getLogger(MainApp1.class);
		
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		
		System.out.println("----------Application Stopped------------");
	}
}