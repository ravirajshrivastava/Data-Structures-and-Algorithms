package Stack;

import java.util.ArrayList;

class MyStack
{
    ArrayList <Integer> al = new ArrayList<>();

    void push(int x)
    {
        al.add(x);
    }
    
    int pop()
    {
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }

    int peek()
    {
        return (al.get(al.size()-1));
    }

    boolean isEmpty()
    {
        return al.isEmpty();
    }

    int size()
    {
        return al.size();
    }
}
public class ArrayListImplementation 
{
    public static void main(String[] args) 
    {
        MyStack s = new MyStack();   
        
        s.push(1);
        s.push(100);
        s.push(1000);

        System.out.println(s.peek());
        s.pop();

        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
    }    
}



