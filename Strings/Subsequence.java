//Check the Subsequence of the number using boolean 

package Mathematics;

public class Subsequence 
{
    boolean checkSubsequence(String st1, String st2)
    {
        int j=0;
        for(int i=0; i<st1.length() && j<st2.length(); i++)
        {
            if(st1.charAt(i) == st2.charAt(j))
            {
                j++;
            }
        }
        return (j == st2.length());
    }
    public static void main(String[] args) 
    {
        String str1 = "ilu";
        String str2 = "ravi";
        Subsequence sq = new Subsequence();

        boolean res =sq.checkSubsequence(str1, str2);
        System.out.println(res);
        
    }    
}
