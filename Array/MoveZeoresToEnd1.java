// Efficient method to print all the 0s at the send of the array

// Concept : All there is need to kepp track of the count of non-zero element as whenever we need to swap the next 
//           non-zero elemnt with the 1st zero element then the index of the 1st zero elent will always be equal
//           the count of non -zero element 
//           i.e always --->>>   index[1st 0th element] = count[non elemnts] 


package Array;

public class MoveZeoresToEnd1 
{
    void swap(int [] arr, int i, int count)
    {
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;
    }
    int[] printZeroToEnd(int[] arr)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                swap(arr, i, count);
                count++;
            }
        }
        return (arr);
        
    }
    public static void main(String[] args) 
    {
        int[] arr = {8,5,0,10,0,20};

        MoveZeoresToEnd1 mze = new MoveZeoresToEnd1();
        mze.printZeroToEnd(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }    
}
