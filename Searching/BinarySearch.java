//Binary Search using iterative Method

package Searching;

public class BinarySearch 
{
    int binSearch(int[] arr, int x)
    {
        int low =0, high = arr.length-1;   // high = 9
        while(low <= high)
        {
            int mid = (low+high)/2;     //  mid = 4

            if(arr[mid] == x)
            {
                return mid;
            }
            else if(arr[mid] > x)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // System.out.println(arr.length);
        BinarySearch bs = new BinarySearch();
        int result = bs.binSearch(arr, 6);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }   
}
