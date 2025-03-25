package in.sp.main.dao;

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
		String item_id1 = "102";
		
		String sql_query = "SELECT * FROM items WHERE item_id=?";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql_query, item_id1);
		System.out.println(map.get("item_id")+" - "+map.get("item_name")+" - "+map.get("item_price"));
	}
}