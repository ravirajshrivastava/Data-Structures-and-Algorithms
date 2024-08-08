// Get the second largest element with just one traversal 


package Array;

import java.util.Scanner;

public class SecondLargestElement_2 
{
    int largest(int[] arr)
    {
        int res = -1, largest=0;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > arr[largest])
            {
                res = largest;
                largest = i;
            }
            else if(res==-1 || arr[i] > arr[res])
            {
                res = i;
            }
        }
        return (arr[res]);
    }   
    
    // @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) 
    {

        SecondLargestElement_2 sle = new SecondLargestElement_2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");

        int n = sc.nextInt();
        int [] arr = new int[n];
        
        System.out.println("Enter the elements of the array : ");
        for(int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(sle.largest(arr));
        // System.out.println(sle.arr[largest]);
    }
}
