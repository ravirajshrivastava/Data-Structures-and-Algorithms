// Problem : Write a code to search the given element in the Single Linked List which will return the postion of the
// element if found else will return -1

//     Time Complexity: O(n) in the worst case.
//     Space Complexity: O(1)
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
public class SearchElement 
{
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        SearchElement se = new SearchElement();

        System.out.println(se.search(head, 10));

    }
    int search(Node head, int element)
    {
        int pos =0;
        if(head == null)
        {
            return -1;
        }
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == element)
            {
                return pos+1;
            }
            pos++;
            curr = curr.next;
        }
        return -1;
    }
}
