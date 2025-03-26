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
    	Employee emp = new Employee();
    	emp.setEmpid(3);
    	emp.setEmpname("ravi");
    	emp.setEmpdept("MERN stack developer");
    	emp.setEmpsalary(250000);
    	
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try
        {
//        	int id = (int) session.save(emp);
//        	System.out.println("Id : "+id);
        	
        	session.persist(emp);
        	
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