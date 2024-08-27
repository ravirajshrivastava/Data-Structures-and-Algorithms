//Question is to roatate the given array by the given number of D values
// Here Time Complexity is O(n) with space complexity of O(d)
//logic : logic is as same as rotating element by one just here temp is equal to size of d unlike previous

package Array;

public class RotateByDElement 
{
    int[] rotateArray(int[] arr, int d)
    {
        int[] temp = new int[d];
        for(int i=0; i<d; i++)
        {
            temp[i] = arr[i];
        }
        for(int i=d; i<arr.length; i++)
        {
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++)
        {
            arr[arr.length-d+i] = temp[i];
        }
        return (arr);
    }
    public static void main(String[] args) 
    {
        int d = 3;
        int[] arr = {1,2,3,4,5};
        RotateByDElement ro = new RotateByDElement();
        ro.rotateArray(arr, d);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    } 
}
