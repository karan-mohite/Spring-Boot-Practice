package in.sp.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingDemo4Log4jApplication 
{
	public static void main(String[] args)
	{
		SpringApplication.run(LoggingDemo4Log4jApplication.class, args);
		
		Logger logger = LogManager.getLogger(LoggingDemo4Log4jApplication.class);
		
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		logger.debug("This is debug message");
	}
}