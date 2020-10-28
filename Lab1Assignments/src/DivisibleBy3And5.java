import java.util.*;
public class DivisibleBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=calculateSum(num);
        System.out.println(result);
	}

	private static int calculateSum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
