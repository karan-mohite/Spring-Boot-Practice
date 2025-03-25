package in.sp.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Items;
import in.sp.main.mappers.ItemsRowMapper;

@Repository
public class SelectDemo 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void selectOperation()
	{
		String sql_query = "SELECT * FROM items";
		List<Items> items_list = jdbcTemplate.query(sql_query, new ItemsRowMapper());
		//System.out.println(items_list);
		
		for(Items item : items_list)
		{
			System.out.println(item.getItemid()+" - "+item.getItemname()+" - "+item.getItemprice());
			System.out.println("-------------------------------");
		}
	}
}
