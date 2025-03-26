package in.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        
        try
        {
//        	Employee emp = session.load(Employee.class, 2);
        	
        	Employee emp = (Employee) session.load("in.sp.beans.Employee", 5);
        	
        	if(emp != null)
        	{
        		System.out.println("Emp Name : "+emp.getEmpname());
            	System.out.println("Emp Dept. : "+emp.getEmpdept());
            	System.out.println("Emp Salary : "+emp.getEmpsalary());
        	}
        	else
        	{
        		System.out.println("No record found");
        	}
        }
        catch(Exception e)
        {
        	System.out.println("Exception Occured");
        	e.printStackTrace();
        }
    }
}