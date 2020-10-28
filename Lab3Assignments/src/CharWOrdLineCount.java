/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To print the number of words,characters and lines in the given string
 */
import java.util.*;
public class CharWOrdLineCount {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String string=sc.nextLine();
    String[] numOfWords=string.split(" "); //split the string by space
    int words=numOfWords.length;
    char[] numOfChar=string.toCharArray(); //convert the string into character array
    int characters=numOfChar.length;
    String[] numOfLines=string.split("\n"); //split the line by \n to get the number of lines 
    int lines=numOfLines.length;
    System.out.println("The number of words in the given string are : "+words);
    System.out.println("The number of characters in the given string are : "+characters);
    System.out.println("The number of lines in the given string are : "+lines);
	}
}
