package anudip.co;

import java.util.Scanner;

public class anudip {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
		int x=obj.nextInt();
	if(x<=9)
	{
		System.out.println("one digit number");
		
	}
	else if( x<=99)
	{
		
		System.out.println("two digit number");
	}
	else if( x<=999)
	{
		
		System.out.println("three digit");
	}
	else if( x<=9999)
	{
		System.out.println("four digit ");
	}

		}
	}


