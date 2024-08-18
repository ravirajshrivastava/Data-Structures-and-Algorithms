// Find the frequency of character in the given string (all lower case) in a alphabetical sorted order..


package Strings;

import java.util.Scanner;

/**
 * CharacterFrequency
 */
public class CharacterFrequency 
{
    void charPrint(String str)
    {
        int[] count =new int[26];
        for(int i=0; i<str.length(); i++)
        {
            count[str.charAt(i) -'a']++;    //calculate the frequency of character
        }
        for(int i=0; i<26; i++)
        {
            if(count[i] > 0)
            {
                System.out.println((char)(i + 'a')+ " " +count[i]); //+ is used for concatenation here..
            }
        }
    }
    
    public static void main(String[] args) {
        CharacterFrequency cf = new CharacterFrequency();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name string: ");
        String str = sc.next();

        cf.charPrint(str);
    }
}