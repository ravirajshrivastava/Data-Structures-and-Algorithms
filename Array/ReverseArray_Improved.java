// Without using another array ....... not a brute ofrce method

// package Array;

// import java.util.Scanner;

// public class ReverseArray_Improved 
// {
//     static int reverse(int arr[])
//     {
//         int j = arr.length -1;
//         for(int i=0; i<j; i++, j--)
//         {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;   
//         }
        
//         return 0;
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];
        
//         System.out.println("Enter the elements: ");
//         for(int i=0; i<size; i++)
//         {
//             arr[i] = sc.nextInt();
//         }

//         reverse(arr);

//         for(int i : arr)
//         {
//             System.out.println(arr[i]);;
//         }

//     }    
// }




package Array;

import java.util.Scanner;

public class ReverseArray_Improved {
    static void reverse(int arr[]) {
        int j = arr.length - 1;
        for (int i = 0; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
