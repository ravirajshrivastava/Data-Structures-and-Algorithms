//Problem Statement : Write a code to find the next greater number for each element present in the array and if
//                     not found any then return -1 for that

// It is the best soln with time Complexity of O(n^2) using the Stack concept;

//Approach : Create a Stack for the last element push the element in the stack explicitly and then return -1 for that
//           for rest elemenst run a for loop from end and in that there are 2 condition if stackk is not empty and 
//           stack[top] <= arr[i] then pop() also if stack is empty then return -1 else return stack[peek(] and at 
//           the last push element arr[i]

package Stack;

import java.util.*;

public class NextGreaterElement 
{
    static ArrayList<Integer> findElement(int[] arr)
    {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();

        s.push(arr[arr.length-1]);
        al.add(-1);

        for(int i=arr.length-2; i>=0; i--)
        {
            while(!s.isEmpty() && arr[i]>= s.peek())
            {
                s.pop();
            }
            
            if(s.isEmpty())
            {
                al.add(-1);
            }
            else
            {
                al.add(s.peek());
            }
            s.push(arr[i]);
        }

        // for(int i=al.size()-1; i>=0; i--)
        // {
        //     System.out.println(al.get(i));
        // }

        Collections.reverse(al);
        return al;

    }
    public static void main(String[] args) 
    {
        int[] arr = {5,15,10,8,6,12,9,18};

        System.out.println(findElement(arr));;

    }    
}
