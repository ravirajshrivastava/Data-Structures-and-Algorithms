// Problem Statement: Find and print the greater element present previously to the given element.

package Stack;

import java.util.*;
public class PreviousGreaterElement 
{
    static void findElement(int[] arr)
    {
        Stack <Integer> s=new Stack<>();
        s.add(arr[0]);
        for(int i=0;i<arr.length;i++)
        {
            while(s.isEmpty()==false && s.peek()<=arr[i])
            {
                s.pop();
            }
            int prev_grt;
            if(s.isEmpty()) 
            {
                prev_grt = -1;
            } 
            else 
            {
                prev_grt = s.peek();
            }
            
            System.out.print(prev_grt+" ");
            s.add(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        int[] arr = {20,30,10,5,15};
        
        findElement(arr);
    }    
}
