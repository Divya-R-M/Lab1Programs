/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To accept a number and to modify it such that each of the digit in the new number
 *        is equal to the difference betweeen two consecutive digits in the original number
 */
import java.util.*;
public class DifferenceBetweenDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		String string=String.valueOf(num);
		int modifiedNum=modifyNumber(string);
		System.out.println("The difference between digit is "+modifiedNum);
	}
	private static Integer modifyNumber(String string) {
		int num1=0,num2,diff,diffNum;
		int length=string.length();
		StringBuffer strBuf=new StringBuffer();
		for(int i=0;i<string.length()-1;i++) {
			num1=Integer.parseInt((String.valueOf((string.charAt(i)))));
			num2=Integer.parseInt((String.valueOf((string.charAt(i+1)))));
			diff=Math.abs(num1-num2);
			strBuf.append(diff);
		}
		strBuf.append(string.charAt(length-1));
		String string1=strBuf.toString();
		diffNum=Integer.parseInt(string1);
		return diffNum;
	}

}
