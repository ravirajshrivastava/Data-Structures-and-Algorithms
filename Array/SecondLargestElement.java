//Get the Second Largest element 

package Array;

class SecondLargestElement
{
    int[] arr = {23, -10, 31, 12, 10, 56, 75, 44, 32, 11};
    int largest;

    int getLargest()
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > arr[largest])
            largest = i;
        }
        return largest;  
    }

    int getSecondLargest()
    {
        int largest = getLargest();
        int secondLargest=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != arr[largest])
            {
                if(arr[i] > arr[secondLargest])
                {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) 
    {
        SecondLargestElement se = new SecondLargestElement();
        System.out.println(se.getSecondLargest());
        
    }
}