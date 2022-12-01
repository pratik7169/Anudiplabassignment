package lab8;


class Area
{
	double area;
	Area(double r)
	{
	 area= (22*r*r)/7;
 
	}
}
class Circle {

   public static void main(String args[]) 
    {   
    
      double rad=4;   
      double rad1=20;
      Area  a=new Area(rad);
      Area  b=new Area(rad1);
      System.out.println("Area of Circle is: " + a.area);//print statement of area 
      System.out.println("Area of circle is: "+ b.area);//print statement of area 
      System.out.println("The radius is: "+ rad);//print statement of radius 
      System.out.println("The radius is: "+ rad1);//print statement of radius
      
    }
}



  
 
