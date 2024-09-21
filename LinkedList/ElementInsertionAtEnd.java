//Problem : Insert the element at the end of the node using insertEnd() mthod with 2 arguments 1st Node head and 2nd
// is int data (which is to be inserted)

// Time Complexity is : O(n)
package LinkedList;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class ElementInsertionAtEnd 
{
    public static void main(String[] args) 
    {
        Node head = null;
        head = insertEnd(head,10);
        head = insertEnd(head,20); 
        head = insertEnd(head,30);
        System.out.println(head.data);
    }
    static Node insertEnd(Node head, int x)
    {
        Node temp = new Node(x);
        if(head == null)
        {
            return temp;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
        
}
