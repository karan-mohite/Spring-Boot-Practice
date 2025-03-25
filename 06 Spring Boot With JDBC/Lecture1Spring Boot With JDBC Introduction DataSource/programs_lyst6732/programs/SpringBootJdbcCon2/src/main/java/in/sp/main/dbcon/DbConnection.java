package in.sp.main.dbcon;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DbConnection
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void checkDbConnection()
	{
		try
		{
			DataSource dataSource = jdbcTemplate.getDataSource();
			
			Connection con = dataSource.getConnection();
			
			if(con != null)
			{
				System.out.println("connection created successfully....");
			}
			else
			{
				System.out.println("connection failed....");
			}
		}
		catch(Exception e)
		{
			System.out.println("connection failed....");
			e.printStackTrace();
		}
	}
}