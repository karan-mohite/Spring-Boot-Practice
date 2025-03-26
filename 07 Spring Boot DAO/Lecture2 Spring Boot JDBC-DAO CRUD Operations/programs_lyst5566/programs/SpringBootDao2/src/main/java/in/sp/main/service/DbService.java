package in.sp.main.service;

import java.util.List;

import in.sp.main.beans.Items;

public interface DbService
{
	public boolean insertService(String item_id, String item_name, String item_price);
	public boolean updateService(String item_id, String item_price);
	public boolean deleteService(String item_id);
	public List<Items> getAllItemsService();
	public Items getItemDetails(String item_id);
}