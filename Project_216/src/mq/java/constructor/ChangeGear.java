package mq.java.constructor;

public class ChangeGear 
{

		public ChangeGear() 
		{
			System.out.println("Hold Clutch");
		}
			
		//Reusable method
		public void changeToFirstGear() 
		{
			System.out.println("Gear Changed to First");
		}
		
		//Reusable method
		public void changeToSecondGear() 
		{
			System.out.println("Gear Changed to Second");
		}
				
		
		public static void main(String[] args) 
		{
			new ChangeGear().changeToFirstGear();
			new ChangeGear().changeToSecondGear();
			
			/*
			 * Object Creation Syntax
			 * 
			 * 		Classname obj=new Classname();
			 * 		obj.methodname();
			 * 		Datatype variablename=obj.variablename;
			 */
			ChangeGear obj=new ChangeGear();
			obj.changeToFirstGear();
			obj.changeToSecondGear();
			
		}
	
}

