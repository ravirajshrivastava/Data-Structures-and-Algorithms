//Find the pair of elements in the sorted array to get the sum equal to the given element. In anyquestion with sorted array
//given it is always best to use the Binary search concpet to reduce the time complexity


package Searching;

import java.util.Scanner;

public class TwoPointerApproach {
    int findPair(int[] arr, int x)
    {
        int low=0, high=arr.length-1;
        while(low <= high)
        {
            if(arr[low] +arr[high] == x)
            {
                System.out.printf("Pair is: %d and %d having sum %d",arr[low],arr[high],x);
                break;
                
            }
            else if(arr[low] +arr[high] > x)
            {
                high = high-1;
            }
            else
            {
                low = low+1;
            }
        }
        System.out.println("No pair found");
        return -1;
    }
    public static void main(String[] args) {
        TwoPointerApproach fp = new TwoPointerApproach();
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.print("Enter the element: ");
        int x = sc.nextInt();

        fp.findPair(arr, x);
        
        // int result = fp.findPair(arr,x);
        // System.out.printf("Sqaure root of the given number %d is %d",x, result); 
    }
    
}
