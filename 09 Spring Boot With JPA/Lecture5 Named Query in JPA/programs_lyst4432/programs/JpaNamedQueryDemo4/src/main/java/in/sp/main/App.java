package in.sp.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import in.sp.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        try
        {
        	TypedQuery<Student> query = entityManager.createNamedQuery("getAllStdDetails", Student.class);
        	List<Student> std_list = query.getResultList();
        	for(Student std : std_list)
        	{
        		System.out.println("Id : "+std.getId());
        		System.out.println("Name : "+std.getName());
        		System.out.println("Rollno : "+std.getRollno());
        		System.out.println("Marks : "+std.getMarks());
        		System.out.println("-------------------------");
        	}
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
