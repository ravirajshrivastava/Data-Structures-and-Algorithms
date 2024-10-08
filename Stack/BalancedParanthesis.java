// Problem Statement : You have to write the code such that it will then whether the paranthesis/ brackets are
// balanced or not and 


package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis
{
    static boolean isBalanced(String str)
    {
        ArrayDeque <Character> ch = new ArrayDeque<>();

        for(int i=0; i< str.length(); i++)
        {
            char x = str.charAt(i);
            if(x == '(' || x == '{' || x == '[')
            {
                ch.push(x);
            }
            else
            {
                if(ch.isEmpty())
                {
                    return false;
                }
                else if(x ==')' && ch.peek() != '(')
                {
                    return false;
                }
                else if (x == ']' && ch.peek() != '[')
                {
                    return false;
                }
                else if (x == '}' && ch.peek() != '{')
                {
                    return false;
                }
                else
                {
                    ch.pop();
                }
            } 
        }
        return ch.isEmpty();
        
    } 
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brackets");

        if(sc.hasNextLine())
        {
            String s = sc.nextLine();

            if(isBalanced(s))
            {
                System.out.println("The paranthesis are balanced");
            }
            else
            {
                System.out.println("The paranthesis are not balanced");
            }
        }
        sc.close();
    }    
}
