package in.sp.main.dao;

import java.util.List;

import in.sp.main.beans.Items;

public interface CrudOperations
{
	public boolean insertValues(String item_id, String item_name, String item_price);
	public boolean updateValues(String item_id, String item_price);
	public boolean deleteValues(String item_id);
	public List<Items> getAllItems();
	public Items getItemDetails(String item_id);
}