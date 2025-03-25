package in.sp.main.dao;

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
		String item_id = "103";
		String sql_query = "SELECT * FROM items WHERE item_id=?";
		Items item = jdbcTemplate.queryForObject(sql_query, new ItemsRowMapper(), item_id);
		System.out.println(item.getItemid()+" - "+item.getItemname()+" - "+item.getItemprice());
	}
}
