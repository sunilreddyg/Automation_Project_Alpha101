package oops.Abstract;

public class Square extends Shape
{

	@Override
	void draw() 
	{
		System.out.println("Square Shape is Completed");
	}
	
	public void extraborders()
	{
		System.out.println("Extra Borders added");
	}
	
	
	public static void main(String[] args) {
		
		Shape obj=new Square();
		obj.draw();
		obj.corners();
		
		//Calling Static Methods from abstract class
		System.out.println(Shape.name);
		Shape.Capture();
	}

}
