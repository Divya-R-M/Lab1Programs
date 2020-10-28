/**
 * Author : Divya R M
 * Date : 23/10/2020
 * Desc : To find the second smallest element in the array by passing an array of integer elements
 *        to the method.
 */

import java.util.*;

public class SecondSmallest {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The second smallest element is " + secondSmallest(arr, n));// method calling
	}

	// -----method definition-----
	private static int secondSmallest(int[] arr, int total) {
		int temp;
		// ------array sorting-------
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1]; // returns the second smallest element
	}

}
