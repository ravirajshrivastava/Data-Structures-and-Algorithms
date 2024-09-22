// doubly Linked List to insert the element at the beginning


package LinkedList;
import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DDL_InsertAtBegin 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be inserted in Doubly Linked List: ");
        int num =sc.nextInt();
        
        Node head = null;
        Node curr = null;
        // Node temp = null;

        for(int i=0; i<num; i++)
        {
            Node newNode = new Node(sc.nextInt());
            if(head == null)
            {
                head = newNode;
                curr = head;
                // temp = head;
            }
            else
            {
                curr.next = newNode;
                newNode.prev = curr;
                curr = curr.next;
                
            }
        }
// Code is to print the original Doubly Linked List

        curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
System.out.println();
//////////////////////////////////////////////////

        head =insertAtBegnning(head, 0);

//code is to print the updated Doubly Linked List
        curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
//////////////////////////////////////////////////
        sc.close();
    }
    static Node insertAtBegnning(Node head, int element)
    {
        Node temp = new Node(element);
        if(head == null)
        {
            head = new Node(element);
            return head;
        }
        else
        {
            temp = new Node(element);
            temp.next = head;
            head.prev = temp;
        }
        return temp;
    }
}

