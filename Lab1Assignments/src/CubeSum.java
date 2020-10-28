
public class CubeSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
        int result=sumOfCubes(num);
        System.out.println(result);
	}

	public static int sumOfCubes(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num!=0) {
			int last = num%10;
		    sum=sum+last*last*last;
		    num=num/10;
		}
		    return sum;
	}
}
