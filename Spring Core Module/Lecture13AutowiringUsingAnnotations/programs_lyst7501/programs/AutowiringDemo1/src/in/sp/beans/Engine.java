package in.sp.beans;

public class Engine 
{
	private String type;

	public void setType(String type) {
		this.type = type;
	}
	
	public void engineWorking()
	{
		System.out.println(type+" Engine starts working");
	}
}
