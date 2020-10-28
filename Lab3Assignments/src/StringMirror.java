/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To create the mirror image of the string using StringBuffer and print them separated
 *        by a pipe(|) symbol
 */
import java.util.*;
public class StringMirror {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string=sc.next().toUpperCase();
		System.out.println("The mirror image separated by a pipe symbol is "+getImage(string));
	}
	private static String getImage(String str) {
		StringBuffer sbf=new StringBuffer(str);
		sbf.reverse();
		return str+"|"+sbf;
	}
}
