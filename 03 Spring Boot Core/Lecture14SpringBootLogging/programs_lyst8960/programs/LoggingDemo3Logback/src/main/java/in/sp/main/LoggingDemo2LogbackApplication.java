package in.sp.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingDemo2LogbackApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(LoggingDemo2LogbackApplication.class, args);
		
		Logger logger = LoggerFactory.getLogger(LoggingDemo2LogbackApplication.class);
		
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		logger.debug("This is debug message");
	}
}