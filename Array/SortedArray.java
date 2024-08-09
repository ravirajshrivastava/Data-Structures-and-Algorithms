package Array;

class SortedArray 
{
    int sort(int[] arr)
    {
        for(int i=1; i<arr.length ; i++)
        {
            if(arr[i] < arr[i-1])
            return -1;
        }
        return 1;
        
    }
    public static void main(String[] args) 
    {
        SortedArray sa = new SortedArray();
        int[] arr = {1, 11, 13, 22, 30};
        int result = sa.sort(arr);
        System.out.println(result);
    }
}
