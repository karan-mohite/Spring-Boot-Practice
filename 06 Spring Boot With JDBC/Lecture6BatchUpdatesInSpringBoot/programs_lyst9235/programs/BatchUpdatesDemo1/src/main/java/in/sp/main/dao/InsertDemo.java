package in.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertDemo 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertOperations()
	{
		//--------way 1-------------
//		String sql_query1 = "INSERT INTO items VALUES('101', 'Shirt', '500')";
//		String sql_query2 = "INSERT INTO items VALUES('102', 'T-Shirt', '600')";
//		String sql_query3 = "INSERT INTO items VALUES('103', 'Jeans', '1000')";
//		
//		int[] count = jdbcTemplate.batchUpdate(sql_query1, sql_query2, sql_query3);
//		for(int i : count)
//		{
//			System.out.println("success : "+i);
//		}
		
		
		
		//-----------way 2-------------------
		String sql_query1 = "INSERT INTO items VALUES('101', 'Shirt', '500')";
		String sql_query2 = "INSERT INTO items VALUES('102', 'T-Shirt', '600')";
		String sql_query3 = "INSERT INTO items VALUES('103', 'Jeans', '1000')";
		
		String[] sql_queries = {sql_query1, sql_query2, sql_query3};
		
		int[] count = jdbcTemplate.batchUpdate(sql_queries);
		for(int i : count)
		{
			System.out.println("success : "+i);
		}
	}
}