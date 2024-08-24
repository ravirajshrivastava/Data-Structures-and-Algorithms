//Create a method and find the sum of the elements of all the sub array

package Array;

public class SubArrayNaiveSum 
{
    void printSum(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++)
            {
                int count =0;
                for(int k=i; k<=j; k++)
                {
                    count += arr[k];
                    
                }
                System.out.print(count+" ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};

        SubArrayNaiveSum sa = new SubArrayNaiveSum();

        sa.printSum(arr);
    }
}
