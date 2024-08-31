//Create a method to Delete an element in array and return the rest elements of the array

// Time COmplexity is O(n);

//Approach : traverse the array once if you get the elemnt to delete then come out of the loop and make another loop from that
// index of the element to the last one storing next elements onwards
package Array;

import java.util.Scanner;

public class DeleteElement
{
	static int elementDlt(int[] arr, int element, int n)
	{
		int i;
		for(i=0; i<n; i++)
		{
			if(arr[i] == element)
				break;
		}
		
		if(i==n)
		{
			return n;
		}
		
		for(int j=i; j<n-1; j++)
		{
			arr[j] = arr[j+1];
		}
		return (n-1);
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();	
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");	
		}
		
		System.out.print("\nEnter the element to be deleted: ");
		int element = sc.nextInt();
		
		n= elementDlt(arr, element, n);
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
