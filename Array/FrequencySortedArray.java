//This code is designed to print the frequencies of elements in a sorted array. It counts how many times each distinct
//element appears and prints each element along with its frequency.

// The program iterates through the array, counting the frequency of each element. Since the array is sorted, it can simply 
//count consecutive occurrences of the same number.

//Time Complexity: O(n)   &&   Space Complexity: O(1)


package Array;

class FrequencySortedArray 
{ 
    static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    	if(n==1 || arr[n-1]!=arr[n-2])
    	System.out.println(arr[n-1]+" "+ 1) ;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

       printFreq(arr, n);

    } 

}
