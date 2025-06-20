package in.sp.main;

import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Student std = new Student();
        std.setName("deepak");
        std.setRollno(101);
        std.setMarks(93.5f);
        std.setUniversity("Aaa University");
        std.setAdimissionDate(new Date());
        
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(std);
        System.out.println(jsonStr);
    }
}
