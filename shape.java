package lab4;



class Circle extends shape
{
	public void getArea() 
	{
		int r=7;
		double  pi = 3.14;
		double area =pi*r*r;
		System.out.println(area);
		
	}
}
class Triangle extends shape
{
	public void getArea() 
	{
		int b=6;
		int h=8;
		double area=(b*h)/2;
		System.out.println(area);
	}
}

public class shape
{

	public static void main(String[] args)
	{
		Circle c = new Circle();
		System.out.println("Area of Circle :");
		c.getArea();
		System.out.println("Area of Triangle");
		Triangle t = new Triangle();
		t.getArea();

	}

}




