// Print all the underlying prime numbers in the from the given limit. 

package Mathematics;

/**
 * Prime
 */
public class Prime {

    boolean isPrime(int num)
    {
        for(int i=2; i<num; i++)
        {
            if(num % i  == 0)
            {
                return false;
            }
        }
        System.out.println(num);
        return true;
    }

    public static void main(String[] args) {
        Prime p = new Prime();

        int num = 15;
        for(int i=2; i<=15; i++)
        {
            p.isPrime(i);
        }
        
    }
}