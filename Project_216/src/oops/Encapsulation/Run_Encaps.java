package oops.Encapsulation;

public class Run_Encaps {

	public static void main(String[] args) 
	{
		Encaps obj=new Encaps();
		String NewEMID=obj.emid="MQ002";
		System.out.println(NewEMID);
		
		obj.setName("Sunil");
		String Myname=obj.getName();
		System.out.println(Myname);

	}

}
