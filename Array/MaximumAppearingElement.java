// Problem Statement : Find the maximum appearing element in the given range of arrays: that is two arrays provided
//                     which gives the extreme values of the ranges provided.


// Logic: Make a another array and store the frequency of the appearing values and simply print the max value.
//        Provided soln is a naive one.
//        Time Complexity : O(n * length*freq)


package Array;

public class MaximumAppearingElement
{
    int MaxAppear(int[] first, int[] last)
    {
        int[] freq = new int[1000];
        for(int i=0; i<first.length; i++)
        {
            for(int j=first[i]; j<=last[i]; j++)
            {
                freq[j] = freq[j] + 1;
            }
        }
        int res=0;
        for(int i=1; i<freq.length; i++)
        {
            if(freq[i] > freq[res])
            {
                res =i;
            }
            
        }
        return res;
    }
    
    public static void main(String[] args) 
    {
        int[] first = {1, 2, 4};
        int[] last = {4, 5, 7};
        
        MaximumAppearingElement mae = new MaximumAppearingElement();
        System.out.println( mae.MaxAppear(first, last));
    }
}
