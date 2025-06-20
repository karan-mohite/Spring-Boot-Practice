package in.sp.main;

import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "https://jsonplaceholder.typicode.com/posts";
    	InputStream inputStream = new URL(url).openStream();
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	JsonNode rootNode = objectMapper.readTree(inputStream);
    	
    	for(JsonNode jsonNode : rootNode)
    	{
    		int userid1 = jsonNode.get("userId").asInt();
    		System.out.println("User Id : "+userid1);
    		
    		int id1 = jsonNode.get("id").asInt();
    		System.out.println("Id : "+id1);
    		
    		String title1 = jsonNode.get("title").asText();
    		System.out.println("Title : "+title1);
    		
    		String body1 = jsonNode.get("body").asText();
    		System.out.println("Body : "+body1);
    		
    		System.out.println("-------------------------------");
    	}
    }
}