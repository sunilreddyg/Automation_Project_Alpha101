package mq.java.methods;

public class TVRemote 
{
	
	//Reusable method
	public void on() 
	{
		System.out.println("Television ON");
	}
	
	//Reusable method
	public void off() 
	{
		System.out.println("Television OFF");
	}
	
	//Reusable method [Static Type]
	public static void StandBY() 
	{
		System.out.println("TV in Stand By Mode");
	}

	
	//Runnable method
	public static void main(String[] args) 
	{
		new TVRemote().on();
		new TVRemote().off();
		
	}

}
