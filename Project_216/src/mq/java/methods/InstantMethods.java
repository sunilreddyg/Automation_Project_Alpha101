package mq.java.methods;

public class InstantMethods 
{
	
	//Instant method
	public void methodA() 
	{
		System.out.println("Method A Executed");
	}
	
	//Instant method
	public void methodB() 
	{
		System.out.println("Method B Executed");
	}

	public static void main(String[] args) 
	{
		new InstantMethods().methodA();
		new InstantMethods().methodB();

	}

}
