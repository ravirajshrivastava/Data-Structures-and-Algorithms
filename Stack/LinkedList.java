//Code is to show the basic implementaion of Stack in the LInkedList form with its all methods.

// Methods are  : push(), pop(), peek(), isEmpty(), size()

package Stack;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class MyStack
{   
    Node head;
    int size;

    MyStack()
    {
        head = null;
        size = 0;
    }

    void push(int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop()
    {
        if(head == null)
        {
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    int peek()
    {
        if(head == null)
        {
            return Integer.MIN_VALUE;
        }
        return head.data;

    }
    boolean isEmpty()
    {
        return( head == null);
    }

    int size()
    {
        return size;
    }

    void printStack()
    {
        if(head == null)
        {
            System.out.println(-1);;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class LinkedList 
{
    public static void main(String[] args) 
    {
        MyStack s = new MyStack();

        s.push(10);
        s.push(100);
        s.push(1000);

        System.out.println( s.peek());
        System.out.println( s.pop());
        System.out.println( s.isEmpty());
        System.out.println( s.size());
        System.out.println(" ");

        s.push(10000);
        s.push(10000000);
        
        s.printStack();

    }
}
