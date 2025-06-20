package in.sp.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//---------write data in json file--------------
//        Student std = new Student();
//        std.setRollno(103);
//        std.setName("rahul");
//        std.setMarks(91.4f);
//        std.setUniversity("Bbb University");
//        
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValue(new File("d://student.json"), std);
//        
//        System.out.println("success");
    	
    	
    	
    	//---------read data from json file---------------
    	ObjectMapper objectMapper = new ObjectMapper();
    	Student std = objectMapper.readValue(new File("d://student.json"), Student.class);
    	
    	System.out.println("Rollno : "+std.getRollno());
        System.out.println("Name : "+std.getName());
        System.out.println("Marks : "+std.getMarks());
        System.out.println("University : "+std.getUniversity());
    }
}