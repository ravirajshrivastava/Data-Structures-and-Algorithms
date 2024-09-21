// Basic idea of List implementation.. How to create node and put data into that.. that's  all here..

package LinkedList;

class Node
{
    int data;
    Node next;  //Self referential structure......... reference to another node

    //Constructor to intialize the new node
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class ListImplementation 
{
    public static void main(String[] args) 
    {
        Node head = new Node(10);

        Node temp1 = new Node(20);
        head.next = temp1; 

        Node temp2 = new Node(30);
        temp1.next = temp2;

    }    
}
