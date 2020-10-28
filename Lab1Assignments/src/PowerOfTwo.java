import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int number = in.nextInt();
	    in.close();

	    if (isPowerOfTwo(number)) {
	      System.out.println(number+" is a power of 2");
	    } else {
	      System.out.printf(number+" is not a power of 2");
	    }
	  }

	  private static boolean isPowerOfTwo(int number) {

	    if (number % 2 != 0) {
	      return false;
	    } else {

	      for (int i = 0; i <= number; i++) {

	        if (Math.pow(2, i) == number) 
	        return true;
	      }
	    }
	    return false;
	}

}
