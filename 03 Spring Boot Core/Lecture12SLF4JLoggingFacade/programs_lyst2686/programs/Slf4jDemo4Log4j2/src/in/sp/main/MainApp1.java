package in.sp.main;

import org.apache.logging.log4j.core.config.Configurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp1 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("-----------Application Started-------------");
		
		Configurator.initialize(null, "classpath:in/sp/resources/log4j.properties");
		
		Logger logger = LoggerFactory.getLogger(MainApp1.class);
		
		logger.error("This is error message....");
		logger.warn("This is warn message....");
		logger.info("This is info message....");
		logger.debug("This is debug message....");
		
		System.out.println("-----------Application Finished-------------");
	}
}