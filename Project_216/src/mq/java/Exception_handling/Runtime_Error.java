package mq.java.Exception_handling;

public class Runtime_Error {

	public static void main(String[] args)  {
		
		
		System.out.println("Program1 started");
		
		
		try {
			int a=99/0;    //Write error code here
			System.out.println("Operation Done");
		} catch (Exception e) {
			System.out.println("Error is Printed");
		}
		
		
		
		System.out.println("Final value is ");
		
		
		
		
		
		System.out.println("Program2 started");
		int a=99/0;
		System.out.println("Final value is "+a);
		
		
		

	}

}
