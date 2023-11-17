package string;

public class String_Builder {

	public static void main(String[] args) {
		
		/*
		 * What is the differenc between String and StrigBuilder
		 * 
		 * 		=> String is unmutable we can't make changes
		 * 			at runtime
		 * 
		 * 		=> StringBuilder and StringBuffer are 
		 * 			mutable so we can make charactes to string
		 * 			at runtime..
		 */
		
		
		//Append charactes to existing string 
		String surname="Gajjala";
		StringBuilder builder=new StringBuilder(surname).append(" ").append("Sunil Reddy");
		String Fullname=builder.toString();
		System.out.println("=> "+Fullname);
		

		//Revers a string using StringBuilder
		StringBuilder builder1=new StringBuilder("WebDriver");
		StringBuilder res=builder1.reverse();
		System.out.println(res.toString());
		
		
		
		
		
	}

}
