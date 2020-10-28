/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To replace all the consonants in the given string with their immediate next alphabet
 */

import java.util.*;
class ReplaceConstants  { 
	public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.next();
        System.out.println(alterString(str.toCharArray())); 
    } 
  // method to check if a character is vowel or not
    static boolean isVowel(char ch)
    { 
        if (ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u'){
            return false; 
        }
        return true;
    } 
  
    // method that replaces consonant with next immediate consonant alphabatically 
    static String alterString(char[] charArr)  
    { 
        for (int i=0;i<charArr.length;i++) 
        { 
            if (!isVowel(charArr[i])) 
            { 
                // if character is z,then replace it with character b 
                if (charArr[i]=='z')  
                { 
                    charArr[i]='b'; 
                } 
                // if the alphabet is not z 
                else
                { 
                    // replacing the element with next alphabet 
                    charArr[i] = (char)(charArr[i]+1); 
                    // if next immediate alphabet is vowel,then take next 2nd immediate alphabet 
                    if (isVowel(charArr[i]))  
                    { 
                        charArr[i]=(char)(charArr[i]+1); 
                    } 
                } 
            } 
        }
        return String.valueOf(charArr); 
    } 
}  