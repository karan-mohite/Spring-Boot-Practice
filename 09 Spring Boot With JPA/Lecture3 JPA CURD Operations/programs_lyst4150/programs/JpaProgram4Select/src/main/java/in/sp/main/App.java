package in.sp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import in.sp.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try
        {
        	Student std = entityManager.find(Student.class, 3);
        	
        	System.out.println("------Student Details--------");
        	System.out.println("Name : "+std.getName());
        	System.out.println("Rollno : "+std.getRollno());
        	System.out.println("Marks : "+std.getMarks());
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally
        {
			entityManager.close();
			entityManagerFactory.close();
		}
    }
}
