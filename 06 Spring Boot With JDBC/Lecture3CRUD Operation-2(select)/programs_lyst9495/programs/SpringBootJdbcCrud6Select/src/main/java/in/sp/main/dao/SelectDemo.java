package in.sp.main.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SelectDemo
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void selectOperation()
	{
		String sql_query = "SELECT * FROM items";
		List<Map<String, Object>> items_list = jdbcTemplate.queryForList(sql_query);
		//System.out.println(items_list);
		
		for(Map<String, Object> map : items_list)
		{
			System.out.println(map.get("item_id")+" - "+map.get("item_name")+" - "+map.get("item_price"));
			System.out.println("--------------------------------");
		}
	}
}
