package in.sp.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Items;
import in.sp.main.mappers.ItemsRowMapper;

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
		boolean status = false;
		
		try
		{
			String sql_query = "UPDATE items SET item_price=? WHERE item_id=?";
			
			int count = jdbcTemplate.update(sql_query, item_price, item_id);
			
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
	public boolean deleteValues(String item_id)
	{
		boolean status = false;
		
		try
		{
			String sql_query = "DELETE FROM items WHERE item_id=?";
			
			int count = jdbcTemplate.update(sql_query, item_id);
			
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
	public List<Items> getAllItems() 
	{
		String sql_query = "SELECT * FROM items";
		
		List<Items> items_list = jdbcTemplate.query(sql_query, new ItemsRowMapper());
		return items_list;
	}

	@Override
	public Items getItemDetails(String item_id)
	{
		String sql_query = "SELECT * FROM items WHERE item_id=?";
		Items item = jdbcTemplate.queryForObject(sql_query, new ItemsRowMapper(), item_id);
		
		return item;
	}
}
