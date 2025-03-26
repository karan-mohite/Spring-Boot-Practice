package in.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try
        {
        	Employee emp = session.get(Employee.class, 1);
        	emp.setEmpname("deepika");
        	
        	session.update(emp);
        	
        	transaction.commit();
        	
        	System.out.println("success");
        }
        catch(Exception e)
        {
        	transaction.rollback();
        	System.out.println("fail");
        	e.printStackTrace();
        }
    }
}