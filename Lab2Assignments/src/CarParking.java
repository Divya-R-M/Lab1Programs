/**
 Author : Divya R M
 Date : 23/10/2020
 Desc : To get the user choice of car parking and to check the availability of free space
        to park the car,also to retrieve the parked car.
*/

import java.util.*;
//--------class that contains the Car Details--------
class CarDetails {
	public String ownerName;
	public String registerNo;

	CarDetails(String ownerName, String registerNo) { // Constructor to initialise the class members
		this.ownerName = ownerName;
		this.registerNo = registerNo;
	}
}

public class CarParking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ----Jagged Array declaration and Instantiation for floorwise-----
		CarDetails story[][] = new CarDetails[5][];
		story[0] = new CarDetails[100];
		story[1] = new CarDetails[70];
		story[2] = new CarDetails[50];
		story[3] = new CarDetails[20];
		story[4] = new CarDetails[10];
        // ----print statements to get the user choice----
		System.out.println("1) Park Car");
		System.out.println("2) Get Car");
		System.out.println("3) Get Available Space");
		System.out.println("Enter the Choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: // Logic for Parking
			System.out.println("Enter the Owner Name");
			String name = sc.next();
			System.out.println("Enter the Register Number");
			String regNo = sc.next();
			CarDetails cd = new CarDetails(name, regNo);
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] == null) { // checks if empty space is available or not
						story[i][j] = cd;
						System.out.println("Your car is parked in number " + j + " in " + i + " story");
						break loop;
					} else {
						System.out.println("Sorry! Parking lot is full");
					}
				}
			}
			break;
		case 2: // Logic for getting the parked car.
			System.out.println("Enter your car's Register Number");
			String carRegNo = sc.next();
			int floor = 0, placeNo = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] != null) {
						CarDetails cdObj = story[i][j];
						String temp = cdObj.registerNo;
						if (carRegNo.equalsIgnoreCase(temp)) { // checking with the register number
							floor = i + 1;
							placeNo = j + 1;
							story[i][j] = null;
						}
					}
				}
			}
			if (floor == 0 && placeNo == 0) {
				System.out.println("The car was not found");
			} else {
				System.out.println("Your car is parked in number " + placeNo + " in " + floor + " story");
			}
			break;
		case 3: // Logic for finding empty place
			loop: for (int i = 0; i < 5; i++) {
				for (int j = 0; j < story[i].length; j++) {
					if (story[i][j] == null) { // checks if empty place is available.
						System.out.println("There is an empty place in  " + j + " in " + i + " story");
						break loop;
					} else {
						System.out.println("Sorry! Parking lot is full");
					}
				}
			}
			break;
		default:
			System.out.println("Choose from the given options!");
		}
	}
}
