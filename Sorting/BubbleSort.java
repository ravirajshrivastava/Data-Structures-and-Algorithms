//Bubble Sort: Adjacent elements are comapred, and if they are in the ewrong order(either ascending or descending, 
//             based on the preference , they are swapped. This process is repeated until this list is sorted.)


// Time Complexity for all avg cases and worst case is: O(n^2)

package Sorting;

import java.util.*;

public class BubbleSort 
{
    public static void bubbleSort(int [] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
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
        BubbleSort bs = new BubbleSort();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        bs.printArray(arr);
        sc.close();

        
    }    
}



