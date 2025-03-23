package in.sp.beans;

import java.util.List;

public class Subjects
{
	private List<String> mysubjects;

	public void setMysubjects(List<String> mysubjects) {
		this.mysubjects = mysubjects;
	}
	
	@Override
	public String toString()
	{
		return mysubjects.toString();
	}
}
