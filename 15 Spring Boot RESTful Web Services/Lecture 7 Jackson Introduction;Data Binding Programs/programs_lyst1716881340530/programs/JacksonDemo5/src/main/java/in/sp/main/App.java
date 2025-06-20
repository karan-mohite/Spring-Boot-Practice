package in.sp.main;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String jsonStrArray = "[\r\n"
				    			+ "	{\r\n"
				    			+ "		\"rollno\": 101,\r\n"
				    			+ "		\"name\": \"deepak\",\r\n"
				    			+ "		\"marks\": 97.5,\r\n"
				    			+ "		\"university\": \"Aaa University\"\r\n"
				    			+ "	},\r\n"
				    			+ "	{\r\n"
				    			+ "		\"rollno\": 102,\r\n"
				    			+ "		\"name\": \"amit\",\r\n"
				    			+ "		\"marks\": 98.4,\r\n"
				    			+ "		\"university\": \"Aaa University\"\r\n"
				    			+ "	}\r\n"
				    			+ "]";
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	List<Student> stdList = objectMapper.readValue(jsonStrArray, new TypeReference<List<Student>>() {});
    	
    	for(Student std : stdList)
    	{
    		System.out.println("Rollno : "+std.getRollno());
            System.out.println("Name : "+std.getName());
            System.out.println("Marks : "+std.getMarks());
            System.out.println("University : "+std.getUniversity());
            System.out.println("------------------------");
    	}
    }
}