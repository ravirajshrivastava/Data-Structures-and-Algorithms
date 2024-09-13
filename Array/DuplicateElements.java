//Removing the Duplicate Elements using Naive Method that is taking a temporary array and copying the non- duplicate 
//elements into that and return the size of the new array

//The space complexity of the algorithm is O(n) because of the temp array used to store the non-duplicate elements.

package Array;

import java.util.Scanner;
   
public class DuplicateElements 
{
    void removeDupplicates(int[] arr, int[] temp)
    {
        int res=0;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] != arr[i-1])
            {
                temp[res] = arr[i];
                res++; 
            }
        }
        res = res+1;
        System.out.println("Size of the array without duplicate elements is: "+res);
    }
     
    public static void main(String[] args) {
        DuplicateElements de = new DuplicateElements();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr =new int[size];
        int[] temp  = new int[size];

        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        // System.out.printf(de.removeDupplicates(arr, temp));
        de.removeDupplicates(arr, temp);
        
    }
}
