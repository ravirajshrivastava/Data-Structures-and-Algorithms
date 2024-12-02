package Hashing;

import java.util.*;


public class HashMapImplementation 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        hm.put("Ravi", 1);
        hm.put("Vishal", 2);
        hm.put("Krishna", 3);
        hm.put("Aayushi", 4);

        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        
        // hm.clear();

        System.out.println(hm);
        
        Set st = hm.entrySet();
        System.out.println(st);


        Iterator itr = st.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) 
        {
            System.out.print(entry.getKey()+ "=" + entry.getValue() + " ");
        }
        


    }    
}
