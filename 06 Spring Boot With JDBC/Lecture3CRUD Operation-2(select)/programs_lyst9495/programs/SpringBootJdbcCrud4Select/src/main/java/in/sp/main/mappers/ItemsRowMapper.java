package in.sp.main.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.main.beans.Items;

public class ItemsRowMapper implements RowMapper<Items>
{
	@Override
	public Items mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		String item_id1 = rs.getString("item_id");
		String item_name1 = rs.getString("item_name");
		String item_price1 = rs.getString("item_price");
		
		Items items = new Items();
		items.setItemid(item_id1);
		items.setItemname(item_name1);
		items.setItemprice(item_price1);
		
		return items;
	}
}