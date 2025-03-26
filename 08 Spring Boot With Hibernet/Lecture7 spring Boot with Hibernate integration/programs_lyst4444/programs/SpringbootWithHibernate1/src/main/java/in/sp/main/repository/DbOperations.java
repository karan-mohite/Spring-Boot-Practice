package in.sp.main.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Employee;

@Repository
public class DbOperations
{
	public boolean saveEmployee(Employee emp)
	{
		boolean status = false;
		
		Configuration cfg = new Configuration();
		cfg.configure("/in/sp/main/resources/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		try
		{
			session.save(emp);
			transaction.commit();
			status = true;
		}
		catch(Exception e)
		{
			transaction.rollback();
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
}