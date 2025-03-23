package in.sp.main;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("---------Calculator App Started-----------");
		
		FileHandler fileHandler = new FileHandler("d://task2.log", true);
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		fileHandler.setFormatter(simpleFormatter);
		
		Logger logger = Logger.getLogger(Task2.class.getName());
		logger.addHandler(fileHandler);
		
		Scanner scanner = new Scanner(System.in);
		
		int no1=0, no2=0, result=0;
		String yn="";
		
		do
		{
			try
			{
				System.out.println("Enter no 1 : ");
				no1 = scanner.nextInt();
				logger.log(Level.INFO, "Enter no 1 : "+no1);
				
				System.out.println("Enter no 2 : ");
				no2 = scanner.nextInt();
				logger.log(Level.INFO, "Enter no 2 : "+no2);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				logger.log(Level.SEVERE, e.toString());
			}
			
			System.out.println("Select the symbol [+, -, *, /] : ");
			String symbol = scanner.next();
			logger.log(Level.INFO, "Select the symbol [+, -, *, /] : "+symbol);
			
			
			switch(symbol)
			{
				case "+":
					result = no1 + no2;
					System.out.println("Addition is : "+result);
					logger.log(Level.INFO, "Addition is : "+result);
					break;
					
				case "-":
					result = no1 - no2;
					System.out.println("Subtraction is : "+result);
					logger.log(Level.INFO, "Subtraction is : "+result);
					break;
					
				case "*":
					result = no1 * no2;
					System.out.println("Multiplication is : "+result);
					logger.log(Level.INFO, "Multiplication is : "+result);
					break;
					
				case "/":
					try
					{
						result = no1 / no2;
						System.out.println("Division is : "+result);
						logger.log(Level.INFO, "Division is : "+result);
					}
					catch(Exception e)
					{
						System.out.println(e);
						logger.log(Level.SEVERE, e.toString());
					}
					break;
					
				default :
					System.out.println("Invalid Symbol");
					logger.log(Level.INFO, "Invalid Symbol");
			}
			
			System.out.println("---------------------------------");
			System.out.println("Do you want to continue, press 'y' for YES or any other key for NO");
			yn = scanner.next();
			System.out.println("---------------------------------");
			logger.log(Level.INFO, "Do you want to continue, press 'y' for YES or any other key for NO : "+yn);
		}
		while(yn.equals("y") || yn.equals("Y"));
		
		System.out.println("---------Calculator App Finished-----------");
	}
}