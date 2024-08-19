// Find the Leftmost Repeating Character in the given string and return the index of the first occured character 

// This one is the naive method as this is having TC of O(n)^2

package Strings;

public class LeftmostRepeatingChar 
{
    int charIndex(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<str.length()-1; j++ )
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String str = "abcd";
        
        LeftmostRepeatingChar lfc = new LeftmostRepeatingChar();

        int res = lfc.charIndex(str);
        System.out.println(res);

    }
}