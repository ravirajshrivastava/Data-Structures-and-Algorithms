// // This code is the implementation of Open Addressing using Linear Probing method


package Hashing;

import java.util.Scanner;

class MyHash {
    int[] arr;
    int cap, size;

    // Constructor to initialize the hash table
    MyHash(int c) {
        cap = c;
        size = 0;
        arr = new int[c]; // Allocate memory for the array
        for (int i = 0; i < c; i++) {
            arr[i] = -1; // Initialize all slots to -1 (indicating empty slots)
        }
    }

    // Hash function to calculate index
    int hash(int key) {
        return key % cap;
    }

    // Search for a key in the hash table
    boolean search(int key) {
        int h = hash(key);
        int i = h;

        while (arr[i] != -1) {
            if (arr[i] == key) {
                return true; // Key found
            }
            i = (i + 1) % cap;
            if (i == h) {
                return false; // Full circle, key not found
            }
        }
        return false; // Key not found
    }

    // Insert a key into the hash table
    boolean insert(int key) {
        if (size == cap) {
            System.out.println("Hash table is full!");
            return false;
        }

        int h = hash(key);
        int i = h;

        // Find the next available slot using linear probing
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
            i = (i + 1) % cap;
        }

        if (arr[i] == key) {
            return false; // Key already exists
        } else {
            arr[i] = key; // Insert the key
            size++;
            return true;
        }
    }

    // Erase a key from the hash table
    boolean erase(int key) {
        int h = hash(key);
        int i = h;

        while (arr[i] != -1) {
            if (arr[i] == key) {
                arr[i] = -2; // Mark the slot as deleted
                size--;
                return true;
            }
            i = (i + 1) % cap;
            if (i == h) {
                return false; // Full circle, key not found
            }
        }
        return false; // Key not found
    }
}

public class OpenAddressing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the hash table: ");
        int capacity = sc.nextInt();

        MyHash hashTable = new MyHash(capacity);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert a key");
            System.out.println("2. Delete a key");
            System.out.println("3. Search for a key");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Insert a key
                    System.out.print("Enter the key to insert: ");
                    int keyToInsert = sc.nextInt();
                    if (hashTable.insert(keyToInsert)) {
                        System.out.println("Key " + keyToInsert + " inserted successfully.");
                    } else {
                        System.out.println("Key insertion failed (already exists or table full).");
                    }
                    break;

                case 2: // Delete a key
                    System.out.print("Enter the key to delete: ");
                    int keyToDelete = sc.nextInt();
                    if (hashTable.erase(keyToDelete)) {
                        System.out.println("Key " + keyToDelete + " deleted successfully.");
                    } else {
                        System.out.println("Key " + keyToDelete + " not found.");
                    }
                    break;

                case 3: // Search for a key
                    System.out.print("Enter the key to search: ");
                    int keyToSearch = sc.nextInt();
                    if (hashTable.search(keyToSearch)) {
                        System.out.println("Key " + keyToSearch + " found.");
                    } else {
                        System.out.println("Key " + keyToSearch + " not found.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
