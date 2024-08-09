//Reverse the elements of the array

package Array;

public class ReverseArray  
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Array before Swap: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("\nArray After Swap: ");
        for(int i=arr.length-1; i>=0; i--)
        {
            
            System.out.print(" "+arr[i]);
        }
    }
}
