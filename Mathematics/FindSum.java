//Problem Statement : Given there is an array of 5 elements. Question is to find the minimum and maximum sum of
//                    any 4 elements present in the array;

package Mathematics;

import java.util.*;

public class FindSum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the 5 elements of the array: ");
        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int sum=0;
        for(int i=1; i<=3; i++)
        {
            sum+=arr[i];
        }
        int min = sum+arr[0];
        int max = sum+arr[4];

        System.out.println("Minimum Sum value = "+ min);
        System.out.println("Maximum Sum value = "+ max );

        sc.close();
    }    
}
