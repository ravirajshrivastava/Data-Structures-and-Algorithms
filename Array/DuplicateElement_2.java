// Remove the duplicate elements from the array and return the size of the new array without using extra space
// and with Time Complexity of O(n)

package Array;

class DuplicateElement_2 
{
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30,30};
        int result = 1;

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] != arr[result-1])
            {
                arr[result] = arr[i];
                result++;
            }
        }
        System.out.println("Size of new array without Duplicate elements are: "+result);
        
    }
}
