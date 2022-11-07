package lab4;

import java.util.ArrayList;
import java.util.List;

public class ArrEvenOddLambda {


public static void main(String[] args) 
	{
		 List<Integer> number = new ArrayList<Integer>(); // Array List
		
		number.add(11);
		number.add(44);
		number.add(31);
		number.add(1);
		number.add(66);
		number.add(69);
		
		number.forEach((n)-> // lambda expression
		{
			if(n%2==0)   // if else Statement
			{
				System.out.println("Number is Even :"+n);
			}
			else 
			{
				System.out.println("Number is Odd :"+n);
			}
		});
		
		
	}

}