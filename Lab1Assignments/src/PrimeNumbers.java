import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        String primeNumbers="";
        for (int i = 1; i <= num1; i++)         
        { 		  	  
           int counter=0; 	  
           for(int num =i; num>=1; num--)
 	  {
              if(i%num==0)
 	     {
  		counter = counter + 1;
 	     }
 	  }
 	  if (counter ==2)
 	  {
 	     //Appended the Prime number to the String
 	     primeNumbers = primeNumbers + i + " ";
 	  }	
        }	
       
        System.out.println(primeNumbers);

	}

}
