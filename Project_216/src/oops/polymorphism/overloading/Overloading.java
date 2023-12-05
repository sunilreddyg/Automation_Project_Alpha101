package oops.polymorphism.overloading;



public class Overloading
{
	//Method without paramter
	public void print_product()
	{
		System.out.println("Iphone");
	}
	
	//Overloading method with double paramter
	public void print_product(double price)
	{
		System.out.println("Iphone"+"     "+price);
		
	}
	
	
	//Overloading method with double paramter
	public void print_product(String phone)
	{
		System.out.println("PhoneName"+"     "+phone);
	}
	
	//Overloading method with String,double paramter
	public void print_product(String color, double price)
	{
		System.out.println("Iphone"+"   "+color+"     "+price);
	}
	
	//Overloading method with double paramter
	public void print_product(double price, String color)
	{
		System.out.println("Iphone"+"   "+price+"     "+color);
	}
	
	//Sequence parameters
	public void print_product(int price, int quantity)
	{
		
	}

	

	public static void main(String[] args)
	{
		Overloading obj=new Overloading();
		obj.print_product();
		obj.print_product("Samsung");
		obj.print_product(10000, 2);
		obj.print_product("BLUE", 50000.00);

	}

}
