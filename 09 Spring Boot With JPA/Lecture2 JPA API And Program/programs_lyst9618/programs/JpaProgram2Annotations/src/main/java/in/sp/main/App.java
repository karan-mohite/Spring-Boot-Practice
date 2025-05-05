package in.sp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.sp.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Student std = new Student();
    	std.setId(2);
    	std.setName("amit");
    	std.setRollno(102);
    	std.setMarks(87.2f);
    	
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        try
        {
        	entityTransaction.begin();
        	entityManager.persist(std);
        	entityTransaction.commit();
        	System.out.println("success");
        }
        catch(Exception e)
        {
        	entityTransaction.rollback();
        	System.out.println("fail");
        	e.printStackTrace();
        }
        finally
        {
        	entityManager.close();
        	entityManagerFactory.close();
        }
    }
}