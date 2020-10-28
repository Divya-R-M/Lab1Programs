/*
 * Author : Divya R M
 * Date : 23/10/2020
 * Desc : to check the salutation for given names using jagged array
 */
public class SalutationCheck {
	public static void main(String[] args) {
		String arr[][] = new String[2][];
		arr[0] = new String[3];
		arr[1] = new String[5];
//Salutations
		arr[0][0] = "Mr";
		arr[0][1] = "Mrs";
		arr[0][2] = "Miss";
		// Assigning the names
		arr[1][0] = "Pratik";
		arr[1][1] = "Aishwarya";
		arr[1][2] = "Surya";
		arr[1][3] = "Rohan";
		arr[1][4] = "Rakesh";
//Displaying the names with salutations
		System.out.println(arr[0][0] + " " + arr[1][0]);
		System.out.println(arr[0][2] + " " + arr[1][1]);
		System.out.println(arr[0][1] + " " + arr[1][2]);
		System.out.println(arr[0][0] + " " + arr[1][3]);
		System.out.println(arr[0][0] + " " + arr[1][4]);
	}
}
