package in.sp.main.dbcon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DbConnection 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void checkConnection()
	{
		try
		{
			String sql_query = "INSERT INTO items VALUES(?,?,?)";
			Object[] params1 = {"101", "T-Shirt", "500"};
			Object[] params2 = {"102", "Shirt", "700"};
			
			int count1 = jdbcTemplate.update(sql_query, params1);
			int count2 = jdbcTemplate.update(sql_query, params2);
			int count3 = jdbcTemplate.update(sql_query, params1);
			int count4 = jdbcTemplate.update(sql_query, params2);
			int count5 = jdbcTemplate.update(sql_query, params1);
			int count6 = jdbcTemplate.update(sql_query, params2);
			
			if(count1>0 && count2>0 && count3>0 && count4>0 && count5>0 && count6>0)
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("fail");
			}
		}
		catch(Exception e)
		{
			System.err.println("fail : "+e.getMessage());
		}
	}
}