/**
 * Author : Divya R M
 * Date : 23/10/2020
 * Desc : To remove the duplicate elements in the array and sort it in descending order.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=sc.nextInt();
        int inputArray[]=new int[size];                                //Declaring and initializing of integer array
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++) {
        	inputArray[i]=sc.nextInt();
        }
        int resultantArray[]=modifyArray(inputArray);
        System.out.println("The sorted array is");
        for(int i=resultantArray.length-1;i>=0;i--) {
        	System.out.println(resultantArray[i]);   
        }
        sc.close();
	}

	public static int[] modifyArray(int[] arr)             //Remove the duplicate elements and sorting in descending order 
	{
		int len=arr.length;
		int[] tempArray = new int[len];  
        int index = 0, count=0;  
        for (int itr=0; itr<len-1; itr++){  
            if (arr[itr] != arr[itr+1]){  
                tempArray[index++] = arr[itr];  
            } 
            else{
            	count++;
            }
         }  
        tempArray[index++] = arr[len-1];     
        int result[]=new int[len-count];                      // Creating and adding elements into the new array
        int j=0;
        for(int i=0;i<len;i++) {
        	if(tempArray[i]<=0) {
        		continue;
        	}
        	else
        		result[j++]=tempArray[i];
        }
        Arrays.sort(result);                                 // Sorting
        return result;
	}

}
