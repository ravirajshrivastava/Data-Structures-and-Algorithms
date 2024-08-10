// Find the first occurence of the element in the sorted array --->>> here Binary Search concept is used and that
// of iterative method 

package Searching;

public class FirstOccurence 
{
    int binSearch(int[] arr, int x)
    {
        int low =0, high = arr.length-1;   // high = 9
        while(low <= high)
        {
            int mid = (low+high)/2;     //  mid = 4

            if(arr[mid] > x)
            {
                high = mid-1;
            }
            else if(arr[mid] < x)
            {
                low = mid+1;
            }
            else
            {
                if(mid == 0 || arr[mid] != arr[mid-1])
                {
                    return mid;
                }
                else
                {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 15, 15, 17, 18, 18, 18, 18, 18, 26};

        // System.out.println(arr.length);
        FirstOccurence bs = new FirstOccurence();
        int result = bs.binSearch(arr, 18);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }   
}    

