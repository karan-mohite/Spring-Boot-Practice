package in.sp.main;

import java.io.InputStream;
import java.net.URL;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "https://jsonplaceholder.typicode.com/posts";
    	InputStream inputStream = new URL(url).openStream();
        
        JsonFactory jsonFactory = new JsonFactory();
        
        JsonParser jsonParser = jsonFactory.createParser(inputStream);
        while(jsonParser.nextToken() != null)
        {
        	//System.out.println(jsonParser.currentToken());
        	
        	if(jsonParser.currentToken() == JsonToken.FIELD_NAME)
        	{
        		String fieldName = jsonParser.currentName();
        		
        		jsonParser.nextToken();
        		
        		if(fieldName.equals("userId"))
        		{
        			int userid1 = jsonParser.getIntValue();
        			System.out.println("User Id : "+userid1);
        		}
        		else if(fieldName.equals("id"))
        		{
        			int id1 = jsonParser.getIntValue();
        			System.out.println("Id : "+id1);
        		}
        		else if(fieldName.equals("title"))
        		{
        			String title1 = jsonParser.getText();
        			System.out.println("Title : "+title1);
        		}
        		else if(fieldName.equals("body"))
        		{
        			String body1 = jsonParser.getText();
        			System.out.println("Body : "+body1);
        		}
        	}
        }
    }
}
