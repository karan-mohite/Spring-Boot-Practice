package in.sp.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		for(int i=1; i<=100000; i++)
		{
			System.out.println(i);
		}

		long endTime = System.currentTimeMillis();
		
		double timeTaken = (endTime - startTime) / 1000.0;
		
		//System.out.println(timeTaken);
		Logger logger = Logger.getLogger(Task1.class.getName());
		
		logger.log(Level.INFO, "Time taken by application is : "+timeTaken+" sec");
	}
}