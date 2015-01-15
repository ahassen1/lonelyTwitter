package ca.ualberta.cs.lonelytwitter;




public class Auhor extends User //automatically extends object
{//extends mean subclass of user, user is superclass
	@Override
	public void setUsername(String x) 
	{
		//username = x;
		//this is like self
		if (x.length()>8){
			throw new RuntimeException("Name too long!");
			//2 types of xceptions
			//1)normal exceptions
			//2)runtime exceptions
			
		}
		this.username = x;
	}
}
