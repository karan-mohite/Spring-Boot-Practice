package in.sp.main.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Items;

@Repository
public class InsertDemo 
{
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public void insertOperations()
	{
		Items item1 = new Items();
		item1.setItemid("110");
		item1.setItemname("ggg");
		item1.setItemprice("7000");
		
		Items item2 = new Items();
		item2.setItemid("111");
		item2.setItemname("hhh");
		item2.setItemprice("8000");
		
		Items item3 = new Items();
		item3.setItemid("112");
		item3.setItemname("iii");
		item3.setItemprice("9000");
		
		List<Items> items_list = new ArrayList<>();
		items_list.add(item1);
		items_list.add(item2);
		items_list.add(item3);
		
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(items_list.toArray());
		
		String sql_query = "INSERT INTO items VALUES(:itemid, :itemname, :itemprice)";
		int[] count = npJdbcTemplate.batchUpdate(sql_query, batch);
		
		for(int i : count)
		{
			System.out.println("success : "+i);
		}
	}
}