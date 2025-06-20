package in.sp.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
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
	public Page<Products> getProductsService(Pageable pageable) throws Exception
	{
		String url = "https://fakestoreapi.com/products";
		
		RestTemplate restTemplate = new RestTemplate();
		String jsonStr = restTemplate.getForObject(url, String.class);
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonFactory jsonFactory = objectMapper.getFactory();
		JsonParser jsonParser = jsonFactory.createParser(jsonStr);
		
		List<Products> productsList = new ArrayList<>();
		
		while(jsonParser.nextToken() != null)
		{
			if(jsonParser.currentToken() == JsonToken.START_OBJECT)
			{
				Products product = objectMapper.readValue(jsonParser, Products.class);
				productsList.add(product);
			}
		}
		
		int startIndex = (int) pageable.getOffset();
		//System.out.println("startIndex : "+startIndex);
		
		int endIndex = Math.min((startIndex + pageable.getPageSize()), productsList.size());
		//System.out.println("endIndex : "+endIndex);
		
		List<Products> paginatedList = productsList.subList(startIndex, endIndex);
		
		return new PageImpl<>(paginatedList, pageable, productsList.size());
	}
}
