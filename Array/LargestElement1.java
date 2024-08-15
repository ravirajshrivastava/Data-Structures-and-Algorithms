//Find the Largest element in array 


package Array;
import java.util.Scanner;

public class LargestElement1 
{
    static int[] arr = new int[5];
    int n = 0;

    int element()
    {
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] > arr[n])
            {
                n = i; 
            }
        }
        return arr[n];
    }
    
    public static void main(String[] args) 
    {
        LargestElement le = new LargestElement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(le.element());
    }
}
