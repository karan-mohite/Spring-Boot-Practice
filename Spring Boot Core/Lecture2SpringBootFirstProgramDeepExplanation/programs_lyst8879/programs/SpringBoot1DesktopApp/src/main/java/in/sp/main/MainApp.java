package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp
{
	public static void main(String[] args) 
	{
		System.out.println("-----------Spring Boot App Started----------------");
		
		SpringApplication.run(MainApp.class, args);
		
		System.out.println("-----------Spring Boot App Finished----------------");
	}
}