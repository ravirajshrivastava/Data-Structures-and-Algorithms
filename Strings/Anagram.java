// Anagram means two string having exactly same characters with the same number of frequency order may 
//not be the same


// Approach : The idea is to check the Anagram in such a way such that first we sort both strings in alphabetical order 
// and then compare each character in both the strings. 

package Mathematics;

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Anagram
 */
public class Anagram 
{
    boolean checkAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String s2 = new String(arr2);

        // int j=0;
        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter the 1st string: ");
            String str1 = sc.nextLine();

            System.out.println("Enter the 2nd string: ");
            String str2 = sc.nextLine();

            Anagram ag = new Anagram();
            boolean result = ag.checkAnagram(str1, str2);

            System.out.println(result);
        }

    }    
}
