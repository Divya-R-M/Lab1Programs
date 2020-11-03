/*
 * Author : Divya R M
 * Desc :  To throw an user defined exception if the user does not enter either the first or the second name.
 */
package name_validation;

import java.util.Scanner;

public class FullNameValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Getting input from user and Checking whether first name and second name is
		 * entered. If not exception is thrown.
		 */
		try {
			System.out.println("Enter the first name");
			String firstName = sc.nextLine();
			if (firstName.isEmpty()) {
				throw new NameException("The FirstName should not be empty");
			}
			System.out.println("Enter the second name");
			String secondName = sc.nextLine();
			sc.close();
			if (secondName.isEmpty()) {
				throw new NameException("The SecondName should not be empty");
			}
			System.out.println("Your Name is: " + firstName + " " + secondName);
		}
		/*
		 * Printing the user define exception.
		 */
		catch (NameException e) {
			System.out.println(e.getMessage());
		}
	}

}
