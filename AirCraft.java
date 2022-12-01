package lab8;

import java.util.Scanner;

class AirCraft{

public static void main(String [] args) { //main method

 int i,n,sum=0,count=0;
System.out.println("enter the row"); //print statement
 Scanner sc = new Scanner(System.in); //accept value from user

 n = sc.nextInt();
 System.out.println("enter the people");

 if(n<0) {  //condition statement
  System.out.println("Invalid Input"); //print statement

 }

 else {

  int a[] = new int[n];  //array for accept people

  for(i=0;i<n;i++) {

   a[i] = sc.nextInt(); //accept people

   if(a[i] <0) { //condition statement

    System.out.println("Invalid Input");

    break;

   }

   else {

    count++;

    sum = sum+a[i];

   }

  }

  if(count == n) {

  for(i=0;i<n;i++) {

   System.out.print(a[i]+" ");

  }

  System.out.println();

  System.out.println("Total passengers: "+sum); //total of all passengers

  }

 }

}

}