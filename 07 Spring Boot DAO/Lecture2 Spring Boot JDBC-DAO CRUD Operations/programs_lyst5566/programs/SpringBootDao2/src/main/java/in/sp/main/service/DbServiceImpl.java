package in.sp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.beans.Items;
import in.sp.main.dao.CrudOperations;

@Service
public class DbServiceImpl implements DbService
{
	@Autowired
	private CrudOperations crudOperations;
	
	@Override
	public boolean insertService(String item_id, String item_name, String item_price)
	{
		boolean status = crudOperations.insertValues(item_id, item_name, item_price);
		return status;
	}

	@Override
	public boolean updateService(String item_id, String item_price)
	{
		boolean status = crudOperations.updateValues(item_id, item_price);
		return status;
	}

	@Override
	public boolean deleteService(String item_id) 
	{
		boolean status = crudOperations.deleteValues(item_id);
		return status;
	}

	@Override
	public List<Items> getAllItemsService()
	{
		return crudOperations.getAllItems();
	}

	@Override
	public Items getItemDetails(String item_id)
	{
		return crudOperations.getItemDetails(item_id);
	}
}