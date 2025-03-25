package in.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertDemo
{
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public void insertOperation()
	{
//		MapSqlParameterSource params = new MapSqlParameterSource();
//		params.addValue("key_itemid", "102");
//		params.addValue("key_itemname", "T-Shirt");
//		params.addValue("key_itemprice", "500");
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("key_itemid", "103")
				.addValue("key_itemname", "Pent-Coat")
				.addValue("key_itemprice", "5500");
		
		String sql_query = "INSERT INTO items VALUES(:key_itemid, :key_itemname, :key_itemprice)";
		
		int count = npJdbcTemplate.update(sql_query, params);
		if(count > 0)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
	}
}