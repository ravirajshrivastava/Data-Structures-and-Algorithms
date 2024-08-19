//Find the leftmost non repeating charater  and return the index of the character if found else return -1
// here we have counted the frequency of charcter and check which is the first element whose count is only one

package Strings;

public class LeftmostNonRepeatingChar
{
    static final int CHAR = 256;    
    int indexValue(String str)
    {
        int[] count = new int[CHAR];

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            count[ch]++;
        }

        for(int i=0; i<str.length(); i++)
        {
            if(count[str.charAt(i)] == 1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        String str = "HHello";
        
        LeftmostNonRepeatingChar lfnc = new LeftmostNonRepeatingChar();
        System.out.println(lfnc.indexValue(str));

    }
}
