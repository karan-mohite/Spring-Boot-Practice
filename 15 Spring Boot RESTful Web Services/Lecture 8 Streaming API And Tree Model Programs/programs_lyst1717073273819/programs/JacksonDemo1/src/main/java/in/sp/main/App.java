package in.sp.main;

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
        System.out.println("Marks : "+std.getMarks());
        System.out.println("University : "+std.getUniversity());
    }
}
