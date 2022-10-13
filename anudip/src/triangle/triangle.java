package triangle;

import java.util.Scanner;

public class triangle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first angle");
		int a=sc.nextInt();
		System.out.println("enter second angle");
		int b=sc.nextInt();
		System.out.println("enter third angle");
		int c=sc.nextInt();
		if(a==b && b==c && c==a)
		{
			System.out.println("equilateral");
			
		}
		else if(a==b || b==c || c==a)
		{
			System.out.println("180");
		}
		else
		{
			System.out.println("scalen");
		}
	}

}
