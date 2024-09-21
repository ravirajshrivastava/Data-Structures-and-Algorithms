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
public class RecusriveLinkedList 
{
    public static void main(String[] args) 
    {
        Node head = new Node(90);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        RecusriveLinkedList rll = new RecusriveLinkedList();

        rll.recursivePrint(head);

    }
        
        void recursivePrint(Node head)
        {
            if(head == null)
            {
                return;
            }
            else
            {
                System.out.print(head.data+" ");
                recursivePrint(head.next);
            }
        }    
}
