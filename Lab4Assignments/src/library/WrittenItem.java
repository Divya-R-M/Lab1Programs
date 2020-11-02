/**
 * author : Divya R M
 * Desc   :  Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos and CDs.) 
 */

package library;

import java.util.Scanner;

public abstract class WrittenItem extends Item {
	private String author;

	// Getter and setter for author
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// Overriding the abstract method addDetails to get inputs from user
	@Override
	public void addDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
		setId(sc.nextLong());
		System.out.println("Enter the Title");
		setTitle(sc.next());
		System.out.println("Enter the number of copies");
		setNoOfCopies(sc.nextInt());
		System.out.println("Enter the Author Name");
		setAuthor(sc.next());
		// sc.close();

	}

	// Overriding the abstract method printDetails to display the user given input
	@Override
	public void printDetails() {
		System.out.println("Id: " + getId());
		System.out.println("Title: " + getTitle());
		System.out.println("Number of Copies: " + getNoOfCopies());
		System.out.println("Author: " + getAuthor());

	}

}
