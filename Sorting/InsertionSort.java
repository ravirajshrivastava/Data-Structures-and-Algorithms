// Sort the given array using Insertion Sort

// Approach: In insertion sort we consider the 1st element = j as sorted element and check i(i=1) with j if
//           arr[i] < arr[j] swap the numbers and move forward in same manner.

// Time Complexity : O(n^2) ------- Best Case: O(n)--------- Avg Case: O(n^2)

package Sorting;

import java.util.*;
public class InsertionSort 
{

    public static void insertSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j= i-1;
            while(j>=0 && key <arr[j])
            {
                arr[j+1] = arr[j];
                arr[j] = key;
                j--;
            }

        }
    }

    void printArray(int [] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        InsertionSort is = new InsertionSort();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        insertSort(arr);
        is.printArray(arr);
        sc.close();

        
    }    
}
