package mq.java.conditions;

public class IF_else_Condition 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * If-else:-->
		 * 		it is a two decision statement
		 */
		
		
		int age=21;
		if (age > 19) 
		{
			System.out.println("Valid Age");
			System.out.println("Profile captured");
		} 
		else 
		{
			System.out.println("invalid Age");
		}
		
		
		System.out.println("Run Continued");
		
		
		
		//Two Decision statement
		boolean flag=false;
		if(flag)   //if only accept on true condition
			System.out.println("Active Status");
		else
			System.out.println("Deactivated");

	}

}
