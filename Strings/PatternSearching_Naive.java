//Create a method which will take two arguments to find the paatern in the given string and return the starting 
// index wherever the pattern is matching

//Time Complexity -- Worst : O((strLength - patLength + 1)*patlength) 


package Strings;

public class PatternSearching_Naive 
{
    void matchPattern(String str, String pat, int strLength, int patLength)
    {
        for(int i=0; i<=strLength-patLength; i++)
        {
            int j=0;
            for(j=0; j<patLength; j++)
            {
                if(str.charAt(i+j) != pat.charAt(j))
                {
                    break;
                }
                
                
            }
            if(j == patLength)
            {
                 {
                    System.out.print((i +" "));
                }
            }
        }

    }

    public static void main(String[] args) 
    {
        String str = "abcabcabcabc";
        String pat = "bca";
        
        int strLength = str.length();
        int patLength = pat.length();
        PatternSearching_Naive psn = new PatternSearching_Naive();
        
        psn.matchPattern(str, pat, strLength, patLength);
    }
}
