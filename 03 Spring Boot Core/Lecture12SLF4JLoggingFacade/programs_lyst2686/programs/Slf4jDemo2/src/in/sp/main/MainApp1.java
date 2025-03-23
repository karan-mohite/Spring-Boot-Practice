package in.sp.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class MainApp1 
{
	public static void main(String[] args)
	{
		System.out.println("-----------Application Started-------------");
		
		Logger logger = LoggerFactory.getLogger(MainApp1.class);
		
		Marker marker = MarkerFactory.getMarker("IMPORTANT");
		
		logger.error("This is error message....");
		logger.warn("This is warn message....");
		logger.info(marker, "This is info message....");
		logger.debug("This is debug message....");
		
		System.out.println("-----------Application Finished-------------");
	}
}