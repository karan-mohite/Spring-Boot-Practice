package in.sp.main.repository;

import in.sp.main.beans.Employee;

public interface DbOperations
{
	public boolean saveEmployee(Employee emp);
	public Employee getEmployeeDetails(int id);
	public boolean updateEmployeeDetails(int id);
	public boolean deleteEmployeeDetails(Employee emp);
}