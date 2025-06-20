package in.sp.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Student std = new Student();
        std.setRollno(103);
        std.setName("rahul");
        std.setMarks(91.4f);
        std.setUniversity("Bbb University");
        
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(std);
        System.out.println(jsonStr);
    }
}