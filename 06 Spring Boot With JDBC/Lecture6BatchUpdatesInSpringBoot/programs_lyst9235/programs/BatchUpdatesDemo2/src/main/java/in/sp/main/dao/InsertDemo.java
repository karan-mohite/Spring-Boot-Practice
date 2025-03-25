package in.sp.main.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Items;

@Repository
public class InsertDemo 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertOperations()
	{
		Items item1 = new Items();
		item1.setItemid("104");
		item1.setItemname("aaa");
		item1.setItemprice("1000");
		
		Items item2 = new Items();
		item2.setItemid("105");
		item2.setItemname("bbb");
		item2.setItemprice("2000");
		
		Items item3 = new Items();
		item3.setItemid("106");
		item3.setItemname("ccc");
		item3.setItemprice("3000");
		
		List<Items> items_list = new ArrayList<>();
		items_list.add(item1);
		items_list.add(item2);
		items_list.add(item3);
		
		String sql_query = "INSERT INTO items VALUES(?,?,?)";
		
		int[] count = jdbcTemplate.batchUpdate(sql_query, new BatchPreparedStatementSetter()
		{
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException 
			{
				Items item = items_list.get(index);
				
				ps.setString(1, item.getItemid());
				ps.setString(2, item.getItemname());
				ps.setString(3, item.getItemprice());
			}
			
			@Override
			public int getBatchSize() 
			{
				return items_list.size();
			}
		});
		
		for(int i : count)
		{
			System.out.println("success : "+i);
		}
	}
}