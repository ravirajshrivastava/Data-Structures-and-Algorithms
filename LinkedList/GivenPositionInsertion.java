// Problem : Inster the given element into given position 

package LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class GivenPositionInsertion {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be inserted: ");
        int num = sc.nextInt();
        Node head = null;
        Node curr = null;

        // Insert nodes into the list using a for loop
        for (int i = 0; i < num; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode;
                curr = head;
            } else {
                curr.next = newNode;
                curr = curr.next;
            }
        }

        // Display the list
        curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();

        // Insert a new element at a given position
        System.out.println("Enter the position to insert and the element: ");
        int pos = sc.nextInt();
        int element = sc.nextInt();

        head = positionInsert(head, pos, element);

        // Display the list after insertion
        curr = head;
        System.out.println("List after insertion:");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static Node positionInsert(Node head, int pos, int element) {
        Node newNode = new Node(element);

        // Case 1: Inserting at the head (position 1)
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        // Case 2: Inserting at any position other than the head
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Check if curr is null to handle out-of-bounds cases
        if (curr == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        // Insert the new node between curr and curr.next
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
