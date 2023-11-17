package mq.java.Variables.Initiation;

public class Runtime_Changes 
{
	
	String name="MQ";					//Accept Runtime changes
	final String mobile="9030248855";   //Doesn't accept runtime changes
	
	
	public static void main(String[] args) 
	{
			//Overriding variable value at runtime
			Runtime_Changes obj=new Runtime_Changes();
			String cname=obj.name="BQ";
			System.out.println(cname);
	}

}
