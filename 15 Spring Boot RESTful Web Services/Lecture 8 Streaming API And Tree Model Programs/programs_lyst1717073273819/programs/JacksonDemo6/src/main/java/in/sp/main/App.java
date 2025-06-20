package in.sp.main;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String jsonStr = "{\r\n"
				    			+ "	\"rollno\": 101,\r\n"
				    			+ "	\"name\": \"deepak\",\r\n"
				    			+ "	\"marks\": 97.5,\r\n"
				    			+ "	\"university\": \"Aaa University\"\r\n"
				    			+ "}";
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	Map<String, Object> map = objectMapper.readValue(jsonStr, new TypeReference<Map<String, Object>>() {});
    	System.out.println(map);
    }
}