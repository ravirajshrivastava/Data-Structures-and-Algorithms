package Hashing;

import java.util.HashSet;
import java.util.*;

public class CountDistinctElements 
{
    
    int countDistinct(int[] arr)
    {
        HashSet<Integer> h = new HashSet<>();
        
        for(int i=0; i< arr.length; i++)
        {
            h.add(arr[i]);
        }

        return h.size();
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");

        for(int i=0;i< size; i++)
        {
            arr[i] = sc.nextInt();
        }

        CountDistinctElements cde = new CountDistinctElements();

        System.out.println(cde.countDistinct(arr));

        sc.close();
        
    }    
}
