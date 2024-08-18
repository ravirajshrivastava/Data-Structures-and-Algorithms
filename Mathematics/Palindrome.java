// Check whether the number is plaindrome or not

package Mathematics;

import java.util.Scanner;

public class Palindrome 
{
    void checkNumber(int num)
    {
        int res = 0;
        int orgNum = num;
        while(num > 0)
        {
            int rem = num%10;
            res = rem + res*10;
            num = num/10;
        }

        if(res == orgNum)
        {
            System.out.printf("Given number %d is palindrome. ",res);
        }
        else
        {
            System.out.println("Given number is not a palindrom number.");
        }
    }

    public static void main(String[] args) {
        Palindrome pd = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        pd.checkNumber(num);
    }

}

