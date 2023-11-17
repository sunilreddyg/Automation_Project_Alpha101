package mq.java.otherpackages;

import mq.java.methodTypes.CallByReference.Book1;
import mq.java.methodTypes.CallByReference.ChooseProduct;

public class Run_OtherPackage_info 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Rule1:-->
		 * 		Only public modifier classes,Variable,methods we 
		 * 		can call outside package
		 * 
		 * Rule2:-->
		 * 		We should import other package classes
		 * 		to current Constructed class
		 */
		Book1 obj=new Book1();
		double newprice=obj.GetPrice();
		System.out.println(newprice);
		
		ChooseProduct.selectBook2().PrintDetails();


	}

}
