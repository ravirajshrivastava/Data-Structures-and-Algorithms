// Problem Statement : Write a code to fit two Stack in one array: 
//Naive Method : Divide the array into  two parts and then perform the required actions

// Better approach : Maintain two pointer one is top and another is bottom and put then consider as two stack
//                   and then perform all the actions..

//Given below is the better approach : TC : O(n)


package Stack;

import java.util.Scanner;

class MyStack
{
    int[] arr;
    int capacity;
    int top;
    int bottom;

    MyStack(int capacity)
    {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
        bottom = capacity;
    }

    boolean push1(int x)
    {
        if(top >= bottom)
        {
            return false;
        }
        top++;
        arr[top] = x;
        return true;
    }

    boolean push2(int x)
    {
        if(bottom <= top+1)
        {
            return false;
        }
        bottom--;
        arr[bottom] = x;
        return true;
    }

    Integer pop1()
    {
        if(top == -1)
        {
            return null;
        }
        int res = arr[top];
        top--;
        return res;
    }

    Integer pop2()
    {
        if(bottom == capacity)
        {
            return null;
        }
        int res = arr[bottom];
        bottom++;
        return res;
    }

    int size1()
    {
        return top+1;
    }

    int size2()
    {
        return (capacity - bottom);
    }
}
public class TwoStacksOneArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of the stack array: ");
        int capacity = sc.nextInt();

        MyStack stack = new MyStack(capacity);
        boolean exit = false;

        while (!exit) {     // as long as the exit is set to false the loop will continue
            System.out.println("Choose an operation:");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Push to Stack 2");
            System.out.println("3. Pop from Stack 1");
            System.out.println("4. Pop from Stack 2");
            System.out.println("5. Display size of Stack 1");
            System.out.println("6. Display size of Stack 2");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the element to push to Stack 1:");
                    int push1Value = sc.nextInt();
                    if (stack.push1(push1Value)) 
                    {
                        System.out.println("Pushed " + push1Value + " to Stack 1.");
                    } else 
                    {
                        System.out.println("Stack 1 Overflow!");
                    }
                    break;

                case 2:
                    System.out.println("Enter the element to push to Stack 2:");
                    int push2Value = sc.nextInt();
                    if (stack.push2(push2Value)) 
                    {
                        System.out.println("Pushed " + push2Value + " to Stack 2.");
                    } 
                    else 
                    {
                        System.out.println("Stack 2 Overflow!");
                    }
                    break;

                case 3:
                    Integer pop1Value = stack.pop1();
                    if (pop1Value != null) 
                    {
                        System.out.println("Popped " + pop1Value + " from Stack 1.");
                    } 
                    else 
                    {
                        System.out.println("Stack 1 Underflow!");
                    }
                    break;

                case 4:
                    Integer pop2Value = stack.pop2();
                    if (pop2Value != null) 
                    {
                        System.out.println("Popped " + pop2Value + " from Stack 2.");
                    } else 
                    {
                        System.out.println("Stack 2 Underflow!");
                    }
                    break;

                case 5:
                    System.out.println("Size of Stack 1: " + stack.size1());
                    break;

                case 6:
                    System.out.println("Size of Stack 2: " + stack.size2());
                    break;

                case 7:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}   
    

