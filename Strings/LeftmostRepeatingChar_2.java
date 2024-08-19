// Find the Leftmost Repeating Character in the given string and return the index of the first occured character 

// This one is the efficient method as this is having TC of O(n) only

package Strings;

public class LeftmostRepeatingChar_2 
{
    int charIndex(String str)
    {
        int j = str.length()-1;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                j--;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) 
    {
        String str = "aBbcBb";
        
        LeftmostRepeatingChar lfc = new LeftmostRepeatingChar();

        int res = lfc.charIndex(str);
        System.out.println(res);

    }
}
