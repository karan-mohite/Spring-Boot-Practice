package in.sp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try
        {
        	String jpql_query = "SELECT std.name, std.marks FROM Student std WHERE std.id = :stdId";
        	TypedQuery<Object[]> query = entityManager.createQuery(jpql_query, Object[].class);
        	query.setParameter("stdId", 2);
        	
        	Object[] obj = query.getSingleResult();
        	
        	System.out.println("-----------Student Details-------------");
        	
        	String name = (String) obj[0];
    		System.out.println("Name : "+name);
    		
    		float marks = (float) obj[1];
    		System.out.println("Marks : "+marks);
    		
    		System.out.println("---------------------------------------");
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