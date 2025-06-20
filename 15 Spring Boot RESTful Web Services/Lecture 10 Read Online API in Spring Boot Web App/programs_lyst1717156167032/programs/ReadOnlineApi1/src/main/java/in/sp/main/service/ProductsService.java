package in.sp.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.main.models.Products;

@Service
public class ProductsService 
{
//	public List<Products> getProductsService() throws Exception
//	{
//		String url = "https://fakestoreapi.com/products";
//		
//		RestTemplate restTemplate = new RestTemplate();
//		String jsonStr = restTemplate.getForObject(url, String.class);
//		
//		ObjectMapper objectMapper = new ObjectMapper();
//		JsonFactory jsonFactory = objectMapper.getFactory();
//		JsonParser jsonParser = jsonFactory.createParser(jsonStr);
//		
//		List<Products> productsList = new ArrayList<>();
//		
//		while(jsonParser.nextToken() != null)
//		{
//			if(jsonParser.currentToken() == JsonToken.START_OBJECT)
//			{
//				Products product = objectMapper.readValue(jsonParser, Products.class);
//				productsList.add(product);
//			}
//		}
//		
//		return productsList;
//	}
	
	
	
	public List<Products> getProductsService() throws Exception
	{
		String url = "https://fakestoreapi.com/products";
		
		RestTemplate restTemplate = new RestTemplate();
		String jsonStr = restTemplate.getForObject(url, String.class);
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonFactory jsonFactory = objectMapper.getFactory();
		JsonParser jsonParser = jsonFactory.createParser(jsonStr);
		
		List<Products> productsList = new ArrayList<>();
		
		JsonToken jsonToken;
		while((jsonToken=jsonParser.nextToken()) != null )
		{
			if(JsonToken.START_OBJECT.equals(jsonToken))
			{
				Products product = objectMapper.readValue(jsonParser, Products.class);
				productsList.add(product);
			}
		}
		
		return productsList;
	}
}
