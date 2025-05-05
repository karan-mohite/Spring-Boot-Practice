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
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        try
        {
        	entityTransaction.begin();
        	
        	Student std = entityManager.find(Student.class, 3);
        	std.setMarks(91.1f);
        	
        	//entityManager.merge(std);		// not needed because entity will be updated automatically when we use setter methods
        	
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
