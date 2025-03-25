package in.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Items;

@Repository
public class InsertDemo
{
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public void insertOperation()
	{
		Items items = new Items();
		items.setItemid("104");
		items.setItemname("Kurta");
		items.setItemprice("2000");
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(items);
		
		String sql_query = "INSERT INTO items VALUES(:itemid, :itemname, :itemprice)";
		
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