package Array;

public class SubArrayNaive 
{
    void printArray(int[] arr)
        {
            for(int i=0; i<arr.length; i++)
            {
                for(int j=i; j<arr.length; j++)
                {
                    for(int k=i; k<=j; k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.print(",");
                }
                System.out.print("\n");
            }
        }
    public static void main(String[] args) 
    {
        SubArrayNaive sa = new SubArrayNaive();
        int[] arr = {1,2,3,4,5,6,7,8,9};

        sa.printArray(arr);
        
    }    
}
