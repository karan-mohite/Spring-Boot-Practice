package in.sp.main;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
//        String jsonStr = "{\r\n"
//			        		+ "	\"rollno\" : 101,\r\n"
//			        		+ "	\"name\" : \"deepak\",\r\n"
//			        		+ "	\"marks\" : 96.5,\r\n"
//			        		+ "	\"gender\" : \"male\"\r\n"
//			        		+ "}";
    	
    	String jsonStr = "[\r\n"
			    			+ "	{\r\n"
			    			+ "		\"rollno\" : 101,\r\n"
			    			+ "		\"name\" : \"deepak\",\r\n"
			    			+ "		\"marks\" : 96.5,\r\n"
			    			+ "		\"gender\" : \"male\"\r\n"
			    			+ "	},\r\n"
			    			+ "	{\r\n"
			    			+ "		\"rollno\" : 102,\r\n"
			    			+ "		\"name\" : \"amit\",\r\n"
			    			+ "		\"marks\" : 91.2,\r\n"
			    			+ "		\"gender\" : \"male\"\r\n"
			    			+ "	},\r\n"
			    			+ "	{\r\n"
			    			+ "		\"rollno\" : 103,\r\n"
			    			+ "		\"name\" : \"priya\",\r\n"
			    			+ "		\"marks\" : 98.5,\r\n"
			    			+ "		\"gender\" : \"female\"\r\n"
			    			+ "	}\r\n"
			    			+ "]";
        
        JsonFactory jsonFactory = new JsonFactory();
        
        JsonParser jsonParser = jsonFactory.createParser(jsonStr);
        while(jsonParser.nextToken() != null)
        {
        	//System.out.println(jsonParser.currentToken());
        	
        	if(jsonParser.currentToken() == JsonToken.FIELD_NAME)
        	{
        		String fieldName = jsonParser.currentName();
        		//System.out.println(fieldName);
        		
        		jsonParser.nextToken();
        		
        		if(fieldName.equals("rollno"))
        		{
        			int rollno1 = jsonParser.getIntValue();
        			System.out.println("Rollno : "+rollno1);
        		}
        		else if(fieldName.equals("name"))
        		{
        			String name1 = jsonParser.getText();
        			System.out.println("Name : "+name1);
        		}
        		else if(fieldName.equals("marks"))
        		{
        			float marks1 = jsonParser.getFloatValue();
        			System.out.println("Marks : "+marks1);
        		}
        		else if(fieldName.equals("gender"))
        		{
        			String gender1 = jsonParser.getText();
        			System.out.println("Gender : "+gender1);
        		}
        	}
        }
    }
}
