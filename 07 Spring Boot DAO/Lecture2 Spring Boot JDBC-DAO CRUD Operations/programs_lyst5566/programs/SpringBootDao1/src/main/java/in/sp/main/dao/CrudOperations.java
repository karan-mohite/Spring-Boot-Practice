package in.sp.main.dao;

public interface CrudOperations
{
	public boolean insertValues(String item_id, String item_name, String item_price);
	public boolean updateValues(String item_id, String item_price);
}