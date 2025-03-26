package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Employee;
import in.sp.main.repository.DbOperations;

@SpringBootApplication
public class SpringbootWithHibernate1Application
{
	public static void main(String[] args) 
	{		
		ApplicationContext context = SpringApplication.run(SpringbootWithHibernate1Application.class, args);
		DbOperations dbop = context.getBean(DbOperations.class);
		
		//-----------insert-------------------------
//		Employee emp = new Employee();
//		emp.setEmpid(2);
//		emp.setEmpname("amit");
//		emp.setEmpdept("java developer");
//		emp.setEmpsalary(120000);
//		
//		boolean status = dbop.saveEmployee(emp);
//		if(status)
//		{
//			System.out.println("insertion success");
//		}
//		else
//		{
//			System.out.println("insertion failed");
//		}
		
		
		
		//----------get employee details-----------------------
//		Employee emp = dbop.getEmployeeDetails(5);
//		if(emp != null)
//		{
//			System.out.println("Employee Name : "+emp.getEmpname());
//			System.out.println("Employee Dept. : "+emp.getEmpdept());
//			System.out.println("Employee Salary : "+emp.getEmpsalary());
//		}
//		else
//		{
//			System.out.println("Employee details not found");
//		}
		
		
		
		//-----------update employee details-------------------
//		boolean status = dbop.updateEmployeeDetails(1);
//		if(status)
//		{
//			System.out.println("updation success");
//		}
//		else
//		{
//			System.out.println("updation failed");
//		}
		
		
		
		//-----------delete employee details-------------------
		Employee emp = new Employee();
		emp.setEmpid(2);
		emp.setEmpname("amit");
		emp.setEmpdept("java developer");
		emp.setEmpsalary(120000);
		
		boolean status = dbop.deleteEmployeeDetails(emp);
		if(status)
		{
			System.out.println("deletion success");
		}
		else
		{
			System.out.println("deletion failed");
		}
	}
}