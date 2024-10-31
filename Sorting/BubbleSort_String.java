//Bubble Sort: Adjacent elements are comapred, and if they are in the ewrong order(either ascending or descending, 
//             based on the preference , they are swapped. This process is repeated until this list is sorted.)


// Time Complexity for all avg cases and worst case is: O(n^2)


package Sorting;

import java.util.*;

public class BubbleSort_String 
{
    public static void bubbleSort(String [] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void printArray(String[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        BubbleSort_String bs = new BubbleSort_String();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        String[] arr = new String[size];

        System.out.print("Enter the elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.next();
        }
        
        bubbleSort(arr);
        bs.printArray(arr);
        sc.close();
    }    
}