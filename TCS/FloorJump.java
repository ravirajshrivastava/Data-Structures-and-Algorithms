//Problem Statement : Find the

package TCS;
import java.util.Scanner;

public class FloorJump 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();  
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(finalDestination(arr));
        sc.close();
    }
    static boolean finalDestination(int[] arr)
    {
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(i > max)
            {
                return false;
            }
            max = Math.max(max, i+ arr[i]);
        }
        return true;
    }
}
