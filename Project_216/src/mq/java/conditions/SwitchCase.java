package mq.java.conditions;

public class SwitchCase {

	public static void main(String[] args) 
	{
		
		
		/*
		 * switch-case:-->
		 * 		It is similar to else if statement. the only difference
		 * 		is switch validate only required condition but else if
		 * 		validate every decision at program
		 */
		
		int month=3;
		
		switch (month) 
		{
		case 1:
			System.out.println("Jan");
			break;
			
		case 2:
			System.out.println("feb");
			break;
			
		case 3:
			System.out.println("mar");
			break;

		default: System.out.println("Month mismatch");
			break;
		}
		
		
		
		//Browser launch using switch case
		String browser="chrome";
		switch (browser) 
		{
		case "chrome":
			System.out.println("Chrome browser is launched");
			break;
			
		case "firefox":
			System.out.println("firefox browser is launched");
			break;

		default:
			System.out.println("browser mismatched");
			break;
		}
		
		
		

	}

}
