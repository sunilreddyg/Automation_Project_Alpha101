package oops.polymorphism.overriding;



public class Circle extends Shape
{
	
	public void draw()
	{
		System.out.println("Child Class mehtod Executed");
	}
	
	public static void main(String[] args) {
		
		Circle obj=new Circle();
		obj.draw();
		
		Shape ref=new Circle();
		ref.draw();
		ref.check();
	}

}
