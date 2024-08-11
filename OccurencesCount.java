package Searching;

import java.util.Scanner;

/**
 * OccurencesCount
 */
public class OccurencesCount {

    int countOccu(int arr[], int n)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if( arr[i] == n)
            {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {

        
        OccurencesCount oc = new OccurencesCount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of the array: ");
        int x = sc.nextInt();

        int[] arr = new int[x];
        System.out.println("Enter the elements: ");
        for(int i=0; i<x; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int n = sc.nextInt();   // Element \

        int result = oc.countOccu(arr,n);
        if(result > 1)
        {
            System.out.printf("The number of occurence of element %d id %d", n, result);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}