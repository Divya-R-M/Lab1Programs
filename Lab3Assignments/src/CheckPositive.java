/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To check whether the given string is positive or not
 */
import java.util.*;
public class CheckPositive {
	private static boolean isPositive(String str) {
		int count = 0;
		char[] charArr = str.toCharArray(); // string to character array
		for (int i=0;i<charArr.length;i++) {
			for (int j=i+1;j<charArr.length;j++) {
				if (charArr[i]<charArr[j]) // Comparing the characters
					count++;
				else
					return false; // if character is not in alphabetical order returns false
			}
		}
		if (count>0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.next();
        if (isPositive(string)) { // method calling
			System.out.println(string + " is a Positive string");
		} else {
			System.out.println(string + " is not a Positive string");
		}
	}
}