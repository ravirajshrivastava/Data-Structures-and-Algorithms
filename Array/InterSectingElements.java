// Find the elements that are common in the both the array and print them in the same order as they are 
// present in the 1st array. 

package Array;


public class InterSectingElements
{
    public static void commonElements(int[] arr1, int[] arr2)
    {
        // int size = Math.max(arr1.length, arr2.length); 
        // int[] arr3 = new int[size];

        int k=0;
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[k] + " ");
                    k++;
                }
            }
        }  
        
        // for(int i : arr3)
        // {
        //     System.out.println(i);
        // }
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {10, 15, 20, 25, 30, 50};
        int[] arr2 = {30, 5, 15, 80};

        commonElements(arr1, arr2);

    } 
}
