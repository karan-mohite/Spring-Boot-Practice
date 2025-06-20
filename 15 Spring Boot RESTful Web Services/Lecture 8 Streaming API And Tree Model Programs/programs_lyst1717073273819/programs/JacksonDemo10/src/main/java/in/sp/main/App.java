package in.sp.main;

import java.io.File;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	JsonFactory jsonFactory = new JsonFactory();
    	
    	JsonGenerator jsonGenerator = jsonFactory.createGenerator(new File("d://student.json"), JsonEncoding.UTF8);
    	
    	jsonGenerator.writeStartObject();
    	
    	jsonGenerator.writeNumberField("rollno", 101);
    	jsonGenerator.writeStringField("name", "deepak");
    	
    	jsonGenerator.writeFieldName("marks");
    	jsonGenerator.writeStartArray();
    		jsonGenerator.writeNumber(91.4f);
    		jsonGenerator.writeNumber(96.3f);
    		jsonGenerator.writeNumber(89.7f);
    	jsonGenerator.writeEndArray();
    	
    	jsonGenerator.writeStringField("gender", "male");
    	
    	jsonGenerator.writeEndObject();
    	
    	jsonGenerator.close();
    	
    	System.out.println("success");
    }
}
