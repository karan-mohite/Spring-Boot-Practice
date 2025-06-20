package in.sp.main;

import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Posts;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "https://jsonplaceholder.typicode.com/posts";
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	Posts[] posts = objectMapper.readValue(new URL(url), Posts[].class);
    	for(Posts post : posts)
    	{
    		System.out.println("UserId : "+post.getUserId());
    		System.out.println("Id : "+post.getId());
    		System.out.println("Title : "+post.getTitle());
    		System.out.println("Body : "+post.getBody());
    		System.out.println("----------------------------------------------");
    	}
    }
}