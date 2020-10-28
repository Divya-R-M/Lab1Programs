/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To read a line of integers and to display each integer and their sum
 */
import java.util.*;

public class IntegerSum {
	public static void main(String[] args) {
		int sum = 0;
		// reading the string using stringTokenizer
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		StringTokenizer intString = new StringTokenizer(string);
		while (intString.hasMoreTokens()) {
			int num = Integer.parseInt(intString.nextToken()); // string to integer conversion
			sum += num;
		}
		System.out.println("The sum of integer string is " + sum); // printing the sum of integer
	}
}