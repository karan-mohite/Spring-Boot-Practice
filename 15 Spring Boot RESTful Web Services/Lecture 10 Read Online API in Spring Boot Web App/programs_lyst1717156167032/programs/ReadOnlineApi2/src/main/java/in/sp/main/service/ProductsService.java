package in.sp.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.main.models.Products;

@Service
public class ProductsService 
{
	public List<Products> getProductsService() throws Exception
	{
		String url = "https://fakestoreapi.com/products";
		
		RestTemplate restTemplate = new RestTemplate();
		String jsonStr = restTemplate.getForObject(url, String.class);
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode rootNode = objectMapper.readTree(jsonStr);
		
		List<Products> productsList = new ArrayList<>();
		
		if(rootNode.isArray())
		{
			for(JsonNode node : rootNode)
			{
				Products product = objectMapper.treeToValue(node, Products.class);
				productsList.add(product);
			}
		}
		
		return productsList;
	}
}
