package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Car;
import in.sp.beans.Engine;

@Configuration
public class SpringConfigFile
{
	@Bean
	public Engine engine()
	{
		Engine engine = new Engine();
		engine.setType("V6");
		return engine;
	}
	
	@Bean
	public Car car()
	{
		Car c = new Car();
		c.setModel("Tata Nexon");
		return c;
	}
}
