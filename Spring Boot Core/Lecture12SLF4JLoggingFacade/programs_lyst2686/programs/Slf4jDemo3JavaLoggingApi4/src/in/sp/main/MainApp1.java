package in.sp.main;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.LogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp1 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("-----------Application Started-------------");
		
		InputStream is = new FileInputStream(System.getProperty("user.dir")+"\\src\\in\\sp\\resources\\javaloggingapi.properties");
		LogManager.getLogManager().readConfiguration(is);
		
		Logger logger = LoggerFactory.getLogger(MainApp1.class);
		
		logger.error("This is error message....");
		logger.warn("This is warn message....");
		logger.info("This is info message....");
		logger.debug("This is debug message....");
		
		System.out.println("-----------Application Finished-------------");
	}
}