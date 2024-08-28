// Create a method to find the find the given number in the given infinite size array

//Logic : What I'll do is to start a while loop till it is true i.e while(true) which will run for infnite time
//         till we reach  any of the return condition.


// Time Complexity : O(n) -------- Space Complexity : O(1)

package Searching;

public class SearchInfiniteSizedArray 
{
    int infiniteSearch(int[] arr, double x)
    {
        int i=0;
        while(true)
        {
            if(arr[i] == x)
            {
                return i;
            }
            if(arr[i] > x)
            {
                return -1;
            }
            i++;
        }
    }

    public static void main(String[] args) 
    {
        int [] arr= {1,10,15,20,40,80,90,100,120,500};

        SearchInfiniteSizedArray sa = new SearchInfiniteSizedArray();
        double x = 90;
        
        System.out.println(sa.infiniteSearch(arr, x));
    }
}
