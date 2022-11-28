package lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadrWrite {

	public static void main(String[] args) throws IOException{
		try (// TODO Auto-generated method stub
		FileWriter x = new FileWriter("demo.txt")) {
			x.write("hi i am pratik");//adding some value in file
			x.write(" am student of anudip foundation");
			x.close();
		}
		File obj=new File("demo.txt"); //create this file in project
		try (Scanner sc = new Scanner(obj)) {
			int counter=0;
			while(sc.hasNextLine())
			{
				String str=sc.nextLine();
				String[] arr=str.split(" "); //words counting
				counter +=arr.length;

			}

              System.out.println(counter);
		}
	}
}

