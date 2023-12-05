package oops.Encapsulation;

import java.util.Date;

public class Encaps 
{
	
	private String name;
	private String password;
	public String emid="MQ001";
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	
	public static void main(String[] args) {
		Encaps obj=new Encaps();
		obj.setName("Sunil");
		String Realname=obj.getName();
		System.out.println(Realname);
	}
	

}
