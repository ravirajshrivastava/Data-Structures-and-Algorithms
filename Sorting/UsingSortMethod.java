// It is just an example of how to use the Array.sort() method and what is its time complexity..
// The time complexity of Arrays.sort() in Java depends on the type of array being sorted:

// For Primitive Data Types (e.g., int[], char[]):

// Time Complexity: O(n log n)
// Algorithm Used: Dual-Pivot Quicksort, which is an optimized version of Quicksort.
// For Objects (e.g., Integer[], String[]):

// Time Complexity: O(n log n)
// Algorithm Used: Timsort, which is a hybrid algorithm derived from Merge Sort and Insertion Sort.
// In both cases, the average time complexity is O(n log n). However, Timsort is generally more efficient for partially sorted arrays or arrays with repeated elements, which is why it is used for object arrays.
// package Sorting;



import java.util.Arrays;

public class UsingSortMethod
{    
    public static void main(String[] args) {
        int[] arr = {13,3743,237,86,386,3961,849,36,87,68,276,183,1754};
        
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i: arr)

        {
            System.out.print(i+" ");
        }
    }
}

