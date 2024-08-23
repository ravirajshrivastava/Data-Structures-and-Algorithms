//Problem Description: We are given a number. The task is to find the Number of Trailing Zeros in the factorial 
//of the number.

//The Trailing Zeros are the Zeros, which appear at the end of a number(factorial in that case)


package Mathematics;

public class FactorailTrailingZero 
{
    void trailZeros(int num)
    {
        int count = 0;

        // Count the number of times 5 is a factor in the numbers from 1 to num
        for (int i = 5; num / i >= 1; i *= 5) {
            count += num / i;
        }
        
        System.out.println("Number of trailing zeros in " + num + "! is: " + count);
    }

    public static void main(String[] args) 
    {
        int num = 20;  // Example number to find the number of trailing zeros in 20!
        FactorailTrailingZero ftz = new FactorailTrailingZero();

        if(num < 0)
        {
            System.out.println(-1);  // Return -1 for invalid input
        }
        else
        {
            ftz.trailZeros(num);
        }
    }    
}
