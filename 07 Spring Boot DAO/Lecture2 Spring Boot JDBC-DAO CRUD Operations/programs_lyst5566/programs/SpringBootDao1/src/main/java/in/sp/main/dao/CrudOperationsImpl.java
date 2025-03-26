package in.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CrudOperationsImpl implements CrudOperations
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean insertValues(String item_id, String item_name, String item_price) 
	{
		boolean status = false;
		
		try
		{
			String sql_query = "INSERT INTO items VALUES(?,?,?)";
			
			int count = jdbcTemplate.update(sql_query, item_id, item_name, item_price);
			
			if(count>0)
			{
				//System.out.println("success");
				status = true;
			}
			else
			{
				//System.out.println("fail");
				status = false;
			}
		}
		catch(Exception e)
		{
			status = false;
			System.out.println(e.getMessage());
		}
		
		return status;
	}

	@Override
	public boolean updateValues(String item_id, String item_price)
	{
		//updation
		return false;
	}
}
