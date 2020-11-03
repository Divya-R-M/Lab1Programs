/*
 * Author : Divya R M
 * Desc : Validate the age of a person and display proper message by using user defined exception. 
 *        if the age of a person is less than 15. 
 */
package age_validation;

import java.util.Scanner;

public class AgeLimitValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * getting the input from the user
		 */
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		sc.close();
		try {
			if (age < 15) {
				/*
				 * Creating user defined exception if condition fails if age is less than 15
				 * then exception occurs.
				 */
				throw new AgeException("Age sholud be above 15");
			} else {
				System.out.println("Your age is " + age);
			}
		}
		/*
		 * Catching the user define exception and printing it
		 */
		catch (AgeException e) {
			System.out.println(e.getMessage());
		}

	}

}