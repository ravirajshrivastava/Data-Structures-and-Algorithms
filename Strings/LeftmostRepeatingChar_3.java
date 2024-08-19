// Find the Leftmost Repeating Character in the given string and return the index of the first occured character 

// This one is the efficient method as this is having TC of O(n) only

package Strings;

public class LeftmostRepeatingChar_3
{
    static final int CHAR = 256;
    int charIndex(String str)
    {
        int res = -1;
        boolean[] visited =  new boolean[CHAR];
        for(int i=str.length()-1; i>=0; i--)
        {
            if(visited[str.charAt(i)])
            {
                res=i;
            }
            else
            {
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
    
    public static void main(String[] args) 
    {
        String str = "aBbcBb";
        
        LeftmostRepeatingChar lfc = new LeftmostRepeatingChar();

        int res = lfc.charIndex(str);
        System.out.println(res);

    }
}
