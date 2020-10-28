/**
 * Author : Divya R M
 * Date : 23/10/2020
 * Desc : To sort the array of string objects in alphabetical order such that the element
 *        in the left half should be in uppercase and the elements in the right half should 
 *        in lowercase.
 */

import java.util.*;

public class StringSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int size = sc.nextInt();
		String[] strArr = new String[size];
		System.out.println("Enter the string");
		// ------getting string input and converting to lower case------
		for (int itr = 0; itr < size; itr++) {
			strArr[itr] = sc.next().toLowerCase();
		}
		String[] sortedArray = sortStrings(strArr);// method calling
		System.out.println("The sorted string array is");
		for (int itr = 0; itr < size; itr++) {
			System.out.println(sortedArray[itr]);
		}
		sc.close();
	}

	// ------method definition------
	public static String[] sortStrings(String[] str) {
		int len = str.length;
		Arrays.sort(str); // array sorting
		// ------if the length of array is even-----
		if (len % 2 == 0) {
			for (int i = 0, j = len / 2; i < len / 2; i++, j++) {
				str[i] = str[i].toUpperCase();
				str[j] = str[j].toLowerCase();
			}
		}
		// ------if the length of array is odd------
		else {
			for (int i = 0; i < len / 2 + 1; i++) {
				str[i] = str[i].toUpperCase();
			}
			for (int j = len / 2 + 1; j < len; j++) {
				str[j] = str[j].toLowerCase();
			}
		}
		return str; // the method returns the string array
	}

}