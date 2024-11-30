// Java program to demonstrate implementation of our own hash table with chaining for collision detection 

package Hashing;

import java.util.*;

class MyHash
{
    int BUCKET;   // No. of slots in a Hash Table
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b)
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();   //new ArrayList<LinkedList<Integer>>(); creates a new empty ArrayList that is intended to store multiple LinkedList<Integer> objects.
        for(int i=0; i<b; i++)                          //At the time of creation, the ArrayList is empty, but it is ready to hold LinkedList elements as they are added.
        {
            table.add(new LinkedList<Integer>());      // After this loop completes, table will contain b empty LinkedList<Integer> objects.
        }
    } 
    
    void insert(Integer key)
    {
        int i = key%BUCKET;
        table.get(i).add(key);
    }

    void delete(Integer key)
    {
        int i = key%BUCKET;
        table.get(i).remove(key);
    }

    boolean search(Integer key)
    {
        int i = key%BUCKET;
        return table.get(i).contains(key);
    }
}

public class ChainingImplementation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Create an instance of MyHash with the given size
        MyHash hashTable = new MyHash(10);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert a key");
            System.out.println("2. Delete a key");
            System.out.println("3. Search for a key");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:  // Insert a key
                    System.out.println("Enter the key to insert: ");
                    int keyToInsert = sc.nextInt();
                    hashTable.insert(keyToInsert);
                    System.out.println("Key " + keyToInsert + " inserted.");
                    break;

                case 2:  // Delete a key
                    System.out.println("Enter the key to delete: ");
                    int keyToDelete = sc.nextInt();
                    hashTable.delete(keyToDelete);
                    System.out.println("Key " + keyToDelete + " deleted (if it existed).");
                    break;

                case 3:  // Search for a key
                    System.out.println("Enter the key to search: ");
                    int keyToSearch = sc.nextInt();
                    if (hashTable.search(keyToSearch)) {
                        System.out.println("Key " + keyToSearch + " found.");
                    } else {
                        System.out.println("Key " + keyToSearch + " not found.");
                    }
                    break;

                case 4:  // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid operation.");
            }
        }


    }    
}
