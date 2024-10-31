package Sorting;

import java.util.*;

public class SelectionSort 
{
    public static void selectionSort(int [] arr)
    {

        for(int i=0; i<arr.length; i++)
        {
            int min = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;   
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        SelectionSort bs = new SelectionSort();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        bs.printArray(arr);
        sc.close();

        
    }    
}