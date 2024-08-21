// Give the string in method and return the reverse the words of the given string 
// I've done this using Stack (LIFO concept)
// time complexity is O(n) and auxilary space requires is also O(n);

package Strings;

import java.util.Stack;

class WordReverse 
{
    public static void printReverse(String str)
    {
       Stack <String> S = new Stack<>(); 

        String[] words = str.split(" ");
        for (String word : words)
        {
            S.push(word);
        }

        while(!S.isEmpty())
        {
            System.out.print(S.pop() + " ");
        }
    }

    public static void main(String[] args) 
    {
        String str = "Hello My name is Ravi";

        printReverse(str);
        
        

    }
}




