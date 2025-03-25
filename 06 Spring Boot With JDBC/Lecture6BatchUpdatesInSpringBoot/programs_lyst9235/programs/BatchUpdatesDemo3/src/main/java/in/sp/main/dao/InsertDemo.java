package in.sp.main.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertDemo 
{
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public void insertOperations()
	{
		Map<String, Object> map1 = new HashMap<>();
		map1.put("key_itemid", "107");
		map1.put("key_itemname", "ddd");
		map1.put("key_itemprice", "4000");
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("key_itemid", "108");
		map2.put("key_itemname", "eee");
		map2.put("key_itemprice", "5000");
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("key_itemid", "109");
		map3.put("key_itemname", "fff");
		map3.put("key_itemprice", "6000");
		
		Map[] map = {map1, map2, map3};
		
		String sql_query = "INSERT INTO items VALUES(:key_itemid, :key_itemname, :key_itemprice)";
		int[] count = npJdbcTemplate.batchUpdate(sql_query, map);
		
		for(int i : count)
		{
			System.out.println("success : "+i);
		}
	}
}