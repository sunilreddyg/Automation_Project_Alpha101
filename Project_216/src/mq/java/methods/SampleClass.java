package mq.java.methods;

public class SampleClass 
{
	//static method
	public static void Start()
	{
		System.out.println("Start");
	}
	
	//Instant method
	public void Change()
	{
		System.out.println("Change");
	}
	
	public static void main(String[] args) 
	{
		//Calling Static Method
		SampleClass.Start();
		
		//Calling Instant Method
		new SampleClass().Change();

	}

}
