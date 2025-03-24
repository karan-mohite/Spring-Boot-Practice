package in.sp.main2;

import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class MainApp2 
{
	public static void main(String[] args)
	{
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/shopping_app");
		config.setUsername("root");
		config.setPassword("root");
		config.setMaximumPoolSize(15);
		
		HikariDataSource dataSource = new HikariDataSource(config);
		
		try(
				Connection con1 = dataSource.getConnection();
				Connection con2 = dataSource.getConnection();
				Connection con3 = dataSource.getConnection();
				Connection con4 = dataSource.getConnection();
				Connection con5 = dataSource.getConnection();
				Connection con6 = dataSource.getConnection();
				Connection con7 = dataSource.getConnection();
				Connection con8 = dataSource.getConnection();
				Connection con9 = dataSource.getConnection();
				Connection con10 = dataSource.getConnection();
				Connection con11 = dataSource.getConnection();
			)
		{
			// register HikariCP pool as an MBean
			MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
			ObjectName poolObjectName = new ObjectName("com.zaxxer.hikari:type=Pool("+dataSource.getPoolName()+")");
			mBeanServer.registerMBean(dataSource.getHikariPoolMXBean(), poolObjectName);
			
			// access the pool statistics using JMX attributes
			int activeConnection = (int) mBeanServer.getAttribute(poolObjectName, "ActiveConnections");
			int idleConnection = (int) mBeanServer.getAttribute(poolObjectName, "IdleConnections");
			int totalConnections = activeConnection + idleConnection;
			
			System.out.println("Total Connection : "+totalConnections);
			System.out.println("Active Connection : "+activeConnection);
			System.out.println("Idle Connection : "+idleConnection);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
