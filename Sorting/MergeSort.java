// sort Algorithm

// Merging : merging means combining two sorted lists & resultant will be another sorted list. 

// T.C = O(nlogn)
// S.C = O(n)



package Sorting;

import java.util.Scanner;

public class MergeSort
{
    public static void sort(int[] arr, int low, int high)
    {
        if (low < high) // Use if instead of while
        {
            int mid = (low + high) / 2;
            sort(arr, low, mid); // Sort the first half
            sort(arr, mid + 1, high); // Sort the second half
            merge(arr, low, mid, high); // Merge the two halves
        }
    }

    public static void merge(int[] arr, int low, int mid, int high)
    {
        int size1 = mid - low + 1;
        int size2 = high - mid;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        // Copy data to temp arrays
        for (int i = 0; i < size1; i++) 
        {
            arr1[i] = arr[low + i];
        }
        for (int j = 0; j < size2; j++) 
        {
            arr2[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low; // Initialize k to low, not 0

        // Merge the temp arrays back into the main array
        while (i < size1 && j < size2) 
        {
            if (arr1[i] <= arr2[j]) 
            {
                arr[k++] = arr1[i++];
            } 
            else 
            {
                arr[k++] = arr2[j++];
            }
        }

        // Copy the remaining elements of arr1, if any
        while (i < size1) 
        {
            arr[k++] = arr1[i++];
        }

        // Copy the remaining elements of arr2, if any
        while (j < size2) 
        {
            arr[k++] = arr2[j++];
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
