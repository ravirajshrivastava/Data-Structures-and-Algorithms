//Write the code to insert the element at the end of Doubly Linked List using insertEnd method

package LinkedList;

class Node 
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}
public class DDL_EndInsert 
{
    public static void main(String[] args) 
    {
        Node head = null;
       
        head =insertEnd(head, 10);
        head =insertEnd(head, 20);
        head =insertEnd(head, 30);
        head =insertEnd(head, 140);
        head =insertEnd(head, 100);

        printList(head);  
    }

    static Node insertEnd(Node head, int element)
    {
        Node newNode= new Node(element);

        if(head == null)
        {
            return newNode;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }
    static void printList(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
