package in.sp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
        	
        	String sql_query = "DELETE FROM std_marks WHERE std_id=:stdId";
        	
        	Query query = entityManager.createNativeQuery(sql_query, Student.class);
        	query.setParameter("stdId", 3);
        	
        	int count = query.executeUpdate();
        	if(count > 0)
        	{
        		entityTransaction.commit();
        		System.out.println("deletion success");
        	}
        	else
        	{
        		entityTransaction.rollback();
        		System.out.println("deletion failed");
        	}
        }
        catch(Exception e)
        {
        	entityTransaction.rollback();
        	e.printStackTrace();
        }
        finally
        {
        	entityManager.close();
        	entityManagerFactory.close();
        }
    }
}
