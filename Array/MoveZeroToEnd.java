//Create a method that will take an array as an arguemnt and will move all the zeores to the end of the array.
// This code is a Naive one

// Concept : Traverse through all the elements as weget the zero elemment then we again run a loop in the right side and as 
// soon we get the non zero element we will swap it with the zeroth elemnt

package Array;

public class MoveZeroToEnd 
{

    void swap(int[] arr, int i, int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    void moveToEnd(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[j] != 0)
                    {
                        swap(arr, i, j);
                        
                    }
                }
            }
        }
        System.out.print("Array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    
    public static void main(String[] args) {
        MoveZeroToEnd mze = new MoveZeroToEnd();

        int[] arr = {10,5,0,0,8,0,9,0};
        // System.out.println("Length :"+arr.length);
        mze.moveToEnd(arr);

    }
}
