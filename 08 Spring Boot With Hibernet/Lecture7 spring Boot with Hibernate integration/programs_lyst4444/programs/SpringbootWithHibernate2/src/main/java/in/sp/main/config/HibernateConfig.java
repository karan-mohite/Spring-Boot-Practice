package in.sp.main.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.sp.main.beans.Employee;

public class HibernateConfig 
{
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg = new Configuration();
		cfg.configure("/in/sp/main/resources/hibernate.cfg.xml");
		
		cfg.addAnnotatedClass(Employee.class);
		
		return cfg.buildSessionFactory();
	}
}