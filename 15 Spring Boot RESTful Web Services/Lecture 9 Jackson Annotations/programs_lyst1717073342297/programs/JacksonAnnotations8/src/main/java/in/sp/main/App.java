package in.sp.main;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

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
        
        Student std = objectMapper.readValue(jsonStr, Student.class);
        
        System.out.println("Rollno : "+std.getRollno());
        System.out.println("Name : "+std.getName());
        
        Map<String, Object> otherProperties = std.getOtherProperties();
        for(Map.Entry<String, Object> me : otherProperties.entrySet())
        {
        	System.out.println(me.getKey()+" : "+me.getValue());
        }
    }
}