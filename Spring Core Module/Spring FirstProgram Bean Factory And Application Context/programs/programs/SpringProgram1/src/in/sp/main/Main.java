package in.sp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.sp.beans.Student;

public class Main
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("/in/sp/resources/applicationContext.xml");
		
		BeanFactory container = new XmlBeanFactory(resource);
		Student std = (Student) container.getBean("stdObj");
		std.display();
	}
}