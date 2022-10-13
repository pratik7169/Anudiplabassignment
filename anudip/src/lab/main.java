package lab;

import java.util.Scanner;

public class main {
public static void main(String args[]) {
	System.out.println("enter roll number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%4==1)
	{
		System.out.println("sapphire");
	}
	else if(a%4==2)
	{
		System.out.println("pearl");
		
	}
	else if(a%4==3)
	{
		System.out.println("ruby");
		
	}
	else if(a%4==4)
	{
		System.out.println("emreald");
	}
}
}
