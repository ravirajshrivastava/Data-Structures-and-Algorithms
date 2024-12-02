// Here we used a HashMap to find the frequency because it is used to store key value pairs.

// T.C = theta(n) and Auxilary Space is O(n)

package Hashing;

import java.util.*;

public class FrequencyofArrayElements 
{
    public static void countFrequency(int[] arr)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int x : arr)
        {
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }

        //One method of printing
        System.out.println(hm);

        //Anothee mehod of printing
        @SuppressWarnings("rawtypes")
        Set st = hm.entrySet();

        @SuppressWarnings("rawtypes")
        Iterator itr = st.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }


        //Another method of printing
        System.out.println();
        for(Map.Entry <Integer, Integer> e : hm.entrySet())
        {
            System.out.print(e.getKey()+"="+e.getValue()+" ");
        }
    }
    public static void main(String[] args) 
    {
        int[] arr;
        arr = new int[]{2, 4, 1, 2,4, 5,6,2 ,4, 5,62,23, 4,2,1,1, 4,1,};

        countFrequency(arr);
            
    }    
}
