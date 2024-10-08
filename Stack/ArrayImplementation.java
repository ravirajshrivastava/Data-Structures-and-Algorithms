//This code is to demonstrate the basic of Array Imlementation (vanilla array)

//Problem : The overflow and underflow condtions are not handled here and also the size of the array is also fixed here 

package Stack;

// import java.util.*;
class MyStack
{
    int[] arr;
    int cap;
    int top;

    MyStack(int cap)
    {
        top = -1;
        this. cap = cap;
        arr = new int[cap];
    }
    void push(int x)
    {
        top++;
        arr[top] = x;
    }
    
    int pop()
    {
        int res = arr[top];
        top--;
        return res; 
    }

    int size()
    {
        return top+1;
    }

    boolean isEmpty()
    {
        return (top == -1);
    }
}

public class ArrayImplementation
{
    public static void main(String[] args)
    {
        MyStack s = new MyStack(5);  

        s.push(1);
        s.push(10);
        s.push(100);

        System.out.println(s.pop());
        s.push(1000);

    }
}
