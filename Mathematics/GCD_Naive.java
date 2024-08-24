//Naive Method to get the GCD of two given numebrs

//Approach --- Find the minimum of the given two numbers and then make a loop from that number to 1 and those 
//who divide the both number first print that numebr 

package Mathematics;

public class GCD_Naive 
{
    int maxValue(int a, int b)
    {
        int res = Math.min(a, b);
        // System.out.println(res);
        for(int i=res; i>0; i--)
        {
            if(a%i == 0 && b%i == 0)
            {
                return i;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        int a=82872, b=712788;
        GCD_Naive gcd = new GCD_Naive();

        System.out.println(gcd.maxValue(a, b));

    }
}
