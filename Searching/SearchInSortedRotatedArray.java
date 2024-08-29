//We have to find the given element in a rotated sorted array 
// Ques can be easily solved by linear traversal of the array and giving the index of th element (Naive solution)

// Main thing is to use the concept of Binary search to decraese the time complexity to O(n) taking advantage of
// sorted array...

// Here given the better solution

//Logic : Since the given array is the rotated form of the sorted array then one half of any combination of the 
// array will always be in the sorted form either the left one or the right one and using that we can take advantage
// and can use concept of Binary Search here...
package Searching;

public class SearchInSortedRotatedArray 
{
    int search(int[] arr, int element)
    {
        int low=0, high= arr.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == element)
            {
                return mid;
            }
            if(arr[mid] >= arr[low])
            {
                if(element >=arr[low] && element < arr[high])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else
            {
                if(element> arr[mid] && element <= arr[high])
                {
                    low = mid+1;

                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int[] arr = {10,20,40,60,6,8};
        int element = 6;

        SearchInSortedRotatedArray sa = new SearchInSortedRotatedArray();

        System.out.println(sa.search(arr, element));
    }
}
