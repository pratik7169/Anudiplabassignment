package lab6;

public class Main extends Number implements Runnable
{
	// example of Thread
	public void run()  // method
	{
		int sqr = 0;
		int[]arr= {10,15,20,25};
	
		for(int i=0;i<arr.length;i++) 
			{
				sqr=arr[i]*arr[i];
				System.out.println(sqr);
			}
		
		System.out.println("Thread 1");
	}
	public static void main(String[] args) 
	{
		
		Main sc=new Main();
		Thread t1=new Thread(sc);  // thread
		t1.start();
		int sum=0;
		float avg;
		for(int i=0;i<=50;i++) // for loop
		{
			sum+=i;
			avg=sum/50;
			
		}
		System.out.println("sum :"+sum);
		System.out.println("avg :"+sum/50);
		System.out.println("This is a main Thread");
		}
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}
	

