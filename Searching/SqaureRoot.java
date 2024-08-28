// Find the square root of the given numbeer, here the time complexity is logx --->> the best available method;
//Here we have used Binary Search.
// for monotonically increasing data we can take binary search into consideration.. 


//Another Method with TC of (x)^1/2 is

// int root(x)
// {
//     int i=1;
//     while(i*i <= x)
//     {
//         i++;
//     }
//     return (i-1);
// }


package Searching;

import java.util.Scanner;

public class SqaureRoot {
    int root(int x)
    {
        int low=0, high=x, mid =0, ans=0;
        while(low <= high)
        {
            mid = (low+high)/2;
            if(mid*mid == x)
            {
                return mid;
            }
            else if(mid*mid >x)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        SqaureRoot rt = new SqaureRoot();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int x = sc.nextInt();
        
        int result = rt.root(x);
        System.out.printf("Sqaure root of the given number %d is %d",x, result);  
    }
    
}
