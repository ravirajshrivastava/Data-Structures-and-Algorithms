// Code is to understand the basic implementatu=ion of the Stack and its different methods.

package Stack;

// import java.util.Stack;
import java.util.*;

public class BasicImplementation 
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)
    {
        Stack s = new Stack();

        s.push(15);
        s.push(20);
        s.push(30);
        s.push("HELLO");
        s.push("My name is Khan and I not a terrorist.");

        //1st method to print the elements inn the order they are stored


        for(Object element: s)
        {
            System.out.print(element+" ");           
        }


        //2nd method to print the elements.

        System.out.println("");
        for(int i=0; i<s.size(); i++)
        {
            System.out.print(s.get(i)+" ");
        }

        System.out.println("");
        System.out.println(s.size());

        System.out.println(s.pop());

        System.out.println(s.peek());

        System.out.println(s.size());

        System.out.println(s.search("HELLO"));

        System.out.println(s.empty());

        //One method to print the elements.


        while(!s.isEmpty())
        {
            System.out.print(s.pop()+", ");
        }
        System.out.println("");
        System.out.println(s.size());
        System.out.println(s.empty());                  




    }  
}
