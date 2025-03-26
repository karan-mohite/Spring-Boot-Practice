package in.sp.main.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Employee;
import in.sp.main.config.HibernateConfig;

@Repository
public class DbOperationsImpl implements DbOperations
{
	@Override
	public boolean saveEmployee(Employee emp)
	{
		boolean status = false;
		
		Transaction transaction = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession();)
		{
			transaction = session.beginTransaction();
			
			session.save(emp);
			transaction.commit();
			status = true;
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public Employee getEmployeeDetails(int id)
	{
		Employee emp = null;
		try(Session session = HibernateConfig.getSessionFactory().openSession();)
		{
			emp = session.get(Employee.class, id);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return emp;
	}
	
	public boolean updateEmployeeDetails(int id)
	{
		boolean status = false;
		
		Transaction transaction = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession();)
		{
			transaction = session.beginTransaction();
			
			Employee emp = session.get(Employee.class, id);
			emp.setEmpsalary(200000);
			
			session.update(emp);
			transaction.commit();
			status = true;
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public boolean deleteEmployeeDetails(Employee emp)
	{
		boolean status = false;
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		try
		{
			session.delete(emp);
			transaction.commit();
			status = true;
		}
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
}
