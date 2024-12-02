// Find the frequnecy of elements of an array when not in a sorted order

// Approach : Use the Arrays.sort() method to sort the elements iterate for i=1 till i= size(array) check for condition.

// Time Complexity : O(nlogn) and Space Complexity is O(1) 

package Array;

import java.util.*;

public class FrequencyofElements 
{

    public static void findFrequency(int[] arr)
    {
        Arrays.sort(arr);
        int count = 1;

        for(int i=1; i<=arr.length; i++)
        {
            if(i < arr.length && arr[i] == arr[i-1])
            {
                count++;
            }
            else
            {
                System.out.println(arr[i-1] +" "+ count);
                count = 1;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }

        findFrequency(arr);
    }    
}





// package Array;

// import java.util.*;

// public class FrequencyofElements {

//     public static void findFrequency(int[] arr) {
//         Arrays.sort(arr);
//         int count = 1;
        
//         for (int i = 1; i <= arr.length; i++) {
//             if (i < arr.length && arr[i] == arr[i - 1]) {
//                 count++;
//             } else {
//                 System.out.println(arr[i - 1] + " " + count);
//                 count = 1;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.print("Enter the elements of the array: ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         findFrequency(arr);
//     }
// }
