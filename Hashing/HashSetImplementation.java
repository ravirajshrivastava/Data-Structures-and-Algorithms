// Multiple Operations used in HashSet in
package Hashing;

import java.util.*;
// import java.util.HashSet;

public class HashSetImplementation 
{
    public static void main(String[] args) 
    {
        HashSet<String> hs = new HashSet<>();

        hs.add("Ram");
        hs.add("Ravi");
        hs.add("wedrftghj");
        hs.add("12");
        hs.add("7323813080");

        System.out.println(hs.size());

        System.out.println(hs);

        hs.remove("Ram");
        System.out.println(hs);
        hs.add("Krishna");

        for(String s: hs)
        {
            System.out.println(s+" ");
        }

        @SuppressWarnings("rawtypes")
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() +" ");
        }

        System.out.println(hs.contains("12"));

        System.out.println(hs.isEmpty());

        // System.out.println(hs.removeAll())

        hs.clear();

        System.out.println(hs);
    }
}
