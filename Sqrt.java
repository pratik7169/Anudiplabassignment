package lab9;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {16,144,169,224};  //given values

    if (PerfectSquare(arr)) {//condition checking
      System.out.println("The array is a perfect square array.");  //print statement
    } else {
      System.out.println("The array is not a perfect square array.");//print statement
    }
  }

  public static boolean PerfectSquare(int[] arr) {
    for (int i = 0; i < arr.length; i++) {  //loop for checking perfect square
      double sqrt = Math.sqrt(arr[i]);
      if (sqrt != (int) sqrt) {
        return false;   
      }
    }
    return true;
  }



	}


