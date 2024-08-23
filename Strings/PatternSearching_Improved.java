//This method is applicable for only if all the elements are distinct here.....although there is nested loop present
// still it will give linear time complexity


package Strings;

public class PatternSearching_Improved 
{
    void matchPattern(String str, String pattern)
    {
        int strLength = str.length();
        int patLength = pattern.length();

        
        for(int i=0; i <= strLength - patLength;)
        {
            int j;
            for(j=0; j < patLength; j++)
            {
                if(str.charAt(i+j) != pattern.charAt(j))
                {
                    break;
                }
            }
            if(j == patLength)
            {
                System.out.printf(i + " ");
                i += j;
            }
            else if(j == 0)
            {
                i++;
            }
            else
            {
                i += j;
            }
            
        }
    }
    
    public static void main(String[] args) 
    {
        String str = "ABCDABCDABCDABCDABCD";
        String pattern = "ABCD";
        
        PatternSearching_Improved psi = new PatternSearching_Improved();

        psi.matchPattern(str, pattern);
    }


}



