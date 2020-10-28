import java.util.Scanner;
public class FibonacciNonRecursive {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        nonRecursiveFibonacci(num);
	}

	public static int nonRecursiveFibonacci(int num) {
		int first=1,second=1;
		System.out.println(first+" "+second+" ");
		for(int i=2;i<num;i++)
		{
			int sum=first+second;
			System.out.println(sum+" ");
			first=second;
			second=sum;
		}
		return 0;
		
		
	}
	
}
