package in.sp.main.dbcon;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

@Repository
public class DbConnection 
{
	@Autowired
	private HikariDataSource dataSource;
	
	public void checkConnection()
	{
		try(
				Connection con1 = dataSource.getConnection();
				Connection con2 = dataSource.getConnection();
				Connection con3 = dataSource.getConnection();
				Connection con4 = dataSource.getConnection();
			)
		{
			int activeConnections = dataSource.getHikariPoolMXBean().getActiveConnections();
			int idleConnections = dataSource.getHikariPoolMXBean().getIdleConnections();
			int totleConnections = dataSource.getHikariPoolMXBean().getTotalConnections();
			
			System.out.println("Active Connections : "+activeConnections);
			System.out.println("Idle Connections : "+idleConnections);
			System.out.println("Totle Connections : "+totleConnections);
			
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.err.println("fail : "+e.getMessage());
		}
	}
}