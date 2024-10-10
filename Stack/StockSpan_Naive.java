// Problem Statement : Write a code to find the span of stock of the given elements in an array where span means :
//                     how many consecutive elemnents in the left side of the current index element is having as 
//                     same or less value than the current element.  PTBN : Span of 1st element is always 1

// Approach:            One loop that iterate over the elements of the array fom the starting and second nested 
//                      loop will itreate from the current elemnt index-1 to 0th index to check the number of spans

// Time Complexity : O(n^2)

package Stack;

import java.util.*;

public class StockSpan_Naive
{
    static void printSpan(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int span = 1;
            for(int j= i-1; j>=0; j--)
            {
                if(arr[i]> arr[j])
                {
                    span++;
                }
            }
            System.out.println(" Span of "+arr[i]+ " is "+ span);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] arr = new int[x];

        for(int i=0; i<x; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        printSpan(arr);
;
    }
} 