package mq.java.methodTypes.CallByReference;

public class RunBooks {

	public static void main(String[] args) 
	{
		
		//Here selectBook1 method return controls to Book1 Class
		String name=ChooseProduct.SelectBook1().GetName();
		System.out.println(name);
		
		//Here Selectbook2 method return controls to Book2 class
		Book2 book2=ChooseProduct.selectBook2();
		double price=book2.GetPrice();
		System.out.println(price);
		book2.PrintDetails();
		
		//Create object for Book1
		Book1 obj=new Book1();
		System.out.println(obj.price);

	}

}
