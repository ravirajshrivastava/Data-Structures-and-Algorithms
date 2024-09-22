//Problem : Delete the head node in the  given code of Linked and return the head.
// the ouput as well

package Mathematics;
import java.util.Scanner;

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
public class DeleteFirstNode 
{
    public static void main(String[] args) 
    {
        Node head = null;
        Node curr = null;
        Scanner sc = new Scanner(System.in);   
        for(int i=0; i<5; i++)
        {
            Node newNode = new Node(sc.nextInt());
            if(head == null)
            {
                head = newNode;
                curr = head;
            }
            else
            {
                curr.next = newNode;
                curr = curr.next;
            }
        }
        sc.close();
        curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
        head = deleteNode(head);
        System.out.println("\nList after deleting first node:");
        curr = head;
        while (curr != null) 
        {
            System.out.print(curr.data + " ");
            curr = curr.next;   
        } 
    }

    public static Node deleteNode(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        else
        {
            head = head.next;
        }
        return head;
    }
}
