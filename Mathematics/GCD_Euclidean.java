//Most optimized and elegant code to find the GCD of the given tow numbers

package Mathematics;

public class GCD_Euclidean 
{
    int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) {
        int a=15, b=60;

        GCD_Euclidean gc = new GCD_Euclidean();
        System.out.println(gc.gcd(a, b));
    }    
}
