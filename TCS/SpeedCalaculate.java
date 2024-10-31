//Question was to find the Speed where distance is given and time must be taken from the user input and the can
// in both integer or float.

package TCS;

import java.util.Scanner;

public class SpeedCalaculate 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float time = sc.nextFloat();

        float speed = 1000/time; 
        System.out.println(speed);

        sc.close();
    }    
}
