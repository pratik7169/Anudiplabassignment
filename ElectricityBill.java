package lab8;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the units");//print statement
		Scanner obj=new Scanner(System.in);//accept units
		double u=obj.nextDouble();//accept units
        int  c;
		if(u<=100) //condition statement
		{
			c= (int) (u*1.20); //this will multiply and send ouput of per unit
			System.out.println("Charges is for per unit:"+c);//print statement
		}
		else if(u>100 && u>300)//condition statement
		{
			c=(int) (u*2);//this will multiply and send ouput of per unit
			System.out.println("Charges is for per unit:"+c);//print statement
			
		}
		else 
		{
			c=(int)(u*3);//this will multiply and send ouput of per unit
			System.out.println("Charges is for per unit:"+c);//print statement
		}
		
		
	
		

	}

}
