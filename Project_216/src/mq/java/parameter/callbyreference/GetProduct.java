package mq.java.parameter.callbyreference;


public class GetProduct 
{
	//Method paramter as Datatype [CallByvalue]
	public void printDay(String Date)
	{
		System.out.println(Date);
	}
	
	//Method Parameter as Class  [CallByreference]
	public void Getinfo(Product product)
	{
		product.printinfo();
	}
	

	public static void main(String[] args) 
	{
		GetProduct obj=new GetProduct();
		obj.printDay("23/09/2022");  //Callbyvalue
		
		obj.Getinfo(new Product());  //CallByReference
	
	}

}
