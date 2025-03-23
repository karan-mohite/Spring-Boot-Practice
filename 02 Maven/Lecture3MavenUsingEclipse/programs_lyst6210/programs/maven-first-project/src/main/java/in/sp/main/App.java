package in.sp.main;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "----------- Project Starts -----------" );
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        System.out.println("------------- Project Finish ------------");
    }
}