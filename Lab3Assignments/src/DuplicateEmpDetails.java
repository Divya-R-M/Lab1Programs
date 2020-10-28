
/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To get the number of duplicate employee details
 */
import java.util.*;

public class DuplicateEmpDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees");
		int number = sc.nextInt();
		String[] name = new String[number];
		String[] designation = new String[number];
		for (int i = 0; i < number; i++) { // Getting Employee details
			System.out.println("Enter the Employee Name");
			name[i] = sc.next();
			System.out.println("Enter the Employee Designation");
			designation[i] = sc.next();
		}
		int duplicateCount = noOfDuplicate(name, designation); // Method calling
		System.out.println("The number of duplicate employee details are " + duplicateCount);
	}

	private static int noOfDuplicate(String[] name, String[] designation) {
		int duplicate = 0;
		// Compares the name and designation for duplicate,if present then duplicate get increasing
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equalsIgnoreCase(name[j]) && designation[i].equalsIgnoreCase(designation[j])) {
					duplicate++;
				}
			}
		}
		return duplicate; // Returns the no of duplicates
	}
}
