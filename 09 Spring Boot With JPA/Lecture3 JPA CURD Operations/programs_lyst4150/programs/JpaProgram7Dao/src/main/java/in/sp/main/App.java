package in.sp.main;

import in.sp.entity.Student;
import in.sp.repository.DbOperations;
import in.sp.repository.DbOperationsImpl;

public class App 
{
    public static void main( String[] args )
    {
    	Student std = new Student();
    	std.setId(3);
    	std.setName("kamal");
    	std.setRollno(103);
    	std.setMarks(86.6f);
    	
        DbOperations dbop = new DbOperationsImpl();
        boolean status = dbop.insertStdDetails(std);
        if(status)
        {
        	System.out.println("success");
        }
        else
        {
        	System.out.println("fail");
        }
    }
}
