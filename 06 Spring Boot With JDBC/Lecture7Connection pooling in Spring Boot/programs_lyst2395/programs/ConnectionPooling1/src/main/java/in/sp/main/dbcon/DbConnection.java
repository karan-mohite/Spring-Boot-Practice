package in.sp.main.dbcon;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbConnection 
{
	@Autowired
	private DataSource dataSource;
	
	public void checkConnection()
	{
		try(
				Connection con1 = dataSource.getConnection();
				Connection con2 = dataSource.getConnection();
				Connection con3 = dataSource.getConnection();
				Connection con4 = dataSource.getConnection();
				Connection con5 = dataSource.getConnection();
//				Connection con6 = dataSource.getConnection();
			)
		{
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.err.println("fail : "+e.getMessage());
		}
	}
}