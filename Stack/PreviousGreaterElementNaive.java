// Problem Ststement: Find and print the greater element present previously to the given element.
// This is the naive soln : here we have used two loop : one is from i=0 to array length and second is the nested
// loop that goes from j= i-1 to j=0 in order to check the first greter element comapring to the element at arr[i]

// Time Complexity : O(n^2)

package Stack;

import java.util.Scanner;

public class PreviousGreaterElementNaive 
{
    static void findElement(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j =i-1; j>=0; j--)
            {
                if(arr[j] > arr[i])
                {
                    System.out.println("Previous Greater element of "+arr[i]+" is"+arr[j]);
                    break;
                }
                if(j == -1)
                {
                    System.out.println("No previous greater element for "+arr[i]);
                }
            }
            
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int x = sc.nextInt();

        int [] arr = new int[x];
        for(int i=0; i<x; i++)
        {
            arr[i] = sc.nextInt();
        }

        findElement(arr);

        sc.close();
    }    
}
