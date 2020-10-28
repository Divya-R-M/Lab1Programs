/**
 * Author : Divya R M
 * Date : 23/10/2020
 * Desc : To create a method which accepts an integer array,reverse the numbers in the array
 *        and returns the resulting array in sorted order.
 */

import java.util.*;

public class ReverseAndSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements in the array");
		// -------to get the input from the user------
		for (int itr = 0; itr < size; itr++) {
			array[itr] = sc.nextInt();
		}
		int sortedArray[] = getSorted(array); // calling the method getSorted()
		System.out.println("The sorted array is");
		// ------to display the sorted array-------
		for (int itr = 0; itr < size; itr++) {
			System.out.println(sortedArray[itr]);
		}
		sc.close();
	}

	// ------to reverse the elements------
	public static int[] getSorted(int[] arr) { // method definition
		for (int itr = 0; itr < arr.length; itr++) {
			int reverse = 0;
			while (arr[itr] > 0) {
				int temp = arr[itr] % 10;
				reverse = reverse * 10 + temp;
				arr[itr] = arr[itr] / 10;
			}
			arr[itr] = reverse;
		}
		Arrays.sort(arr); // sorting the array
		return arr;
	}
}
