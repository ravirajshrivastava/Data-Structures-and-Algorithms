//Problem Statement : You have been given a Linked List with the 1st node as head node and you have to insert the data at the 
// 1st poition.

// Logic make a method with two argiuments one having current head node and the 2nd argument will hold the new data to be inserted
// and make a temp node- assign the new data to temp and then next step is temp.next will be head and done........

// TC = O(1)

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
