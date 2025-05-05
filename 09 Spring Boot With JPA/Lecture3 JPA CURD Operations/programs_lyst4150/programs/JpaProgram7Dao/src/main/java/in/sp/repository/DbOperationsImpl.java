package in.sp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.sp.entity.Student;

public class DbOperationsImpl implements DbOperations
{
	@Override
	public boolean insertStdDetails(Student std)
	{
		boolean status = false;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        
        try
        {
        	entityTransaction.begin();
        	entityManager.persist(std);
        	entityTransaction.commit();
        	
        	status = true;
        }
        catch(Exception e)
        {
        	entityTransaction.rollback();
        	
        	status = false;
        	
        	e.printStackTrace();
        }
        finally
        {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return status;
	}
}