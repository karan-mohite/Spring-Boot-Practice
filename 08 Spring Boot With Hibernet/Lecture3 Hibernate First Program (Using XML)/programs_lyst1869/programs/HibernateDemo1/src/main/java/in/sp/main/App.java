package in.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        Student std = new Student();
        std.setStdid(3);
        std.setName("kamal");
        std.setRollno(103);
        std.setMarks(81.2f);
        
        Configuration cfg = new Configuration();
        cfg.configure("/in/sp/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try
        {
        	session.save(std);
            transaction.commit();
            System.out.println("success");
        }
        catch(Exception e)
        {
        	transaction.rollback();
        	System.out.println("fail");
        	e.printStackTrace();
        }
        finally
        {
        	session.close();
        	sessionFactory.close();
        }
    }
}
