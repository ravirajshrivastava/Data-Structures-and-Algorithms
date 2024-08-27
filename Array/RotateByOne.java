//Create a mthod that will take array as an argument and rotate the array to left by one
// This one is the very basic and naive method

//Logic : all i'm doing is to copy the 1st elemnt value in temp variable an then in a loop copy arr[i+1] elemnt
// into arr[i] elemnt till arr.lengtn-1 and at last copy the temp varaible elemnt into last index of the array.

package Array;

public class RotateByOne 
{
    int[] rotateArray(int[] arr)
    {
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp; 
        return (arr);
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5};
        RotateByOne ro = new RotateByOne();
        ro.rotateArray(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
