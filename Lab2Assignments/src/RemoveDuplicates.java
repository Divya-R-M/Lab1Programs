/**
 * Author : Divya R M
 * Date : 23/10/2020
 * Desc : To remove the duplicate elements in the array and sort it in descending order.
 */

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // sorting the array
		System.out.println("The new array is "); // printing the new array
		for (int i = n - 1; i > 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}

	// ---------using temporary array to store the unique elements---------
	private static int[] modifyArray(int[] arr, int total) {
		int j = 0;
		int temp[] = new int[total];
		for (int i = 0; i < total - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j] = arr[total - 1];
		// --------to return the new array-------
		for (int i = 0; i < total; i++) {
			arr[i] = temp[i];
		}
		return arr;
	}
}
