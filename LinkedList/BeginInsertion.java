package LinkedList;

class Node
{
    int data;
    Node next;      //self refernce structure

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class BeginInsertion 
{
    public static void main(String[] args) 
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head);

        BeginInsertion bi = new BeginInsertion();
        bi.beginInsert(head, -1);
    }
    public static void printList(Node head)
    {
        System.out.print("Before Insertion: ");
        Node curr = head;
        while(curr!= null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    void beginInsert(Node head, int x)
    {
        Node temp = new Node(x);
        temp.next = head;
        System.out.print("\nAFter Insertion: ");
        Node curr = temp;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
