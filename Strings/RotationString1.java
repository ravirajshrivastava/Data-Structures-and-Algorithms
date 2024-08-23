//Another method to find the sstring is roated form of given string or not 

//The indexOf() method in Java is used to find the index of the first occurrence of a specified character or 
//substring within a string. If the character or substring is found, indexOf() returns the index of its 
//first occurrence; otherwise, it returns -1.


// New :  indexOf()

package Strings;

public class RotationString1 
{
    String rotated;
    boolean toCheck(String given, String check)
    {
        if (given.length() != check.length()) 
        {
            return false;
        }
        return((given + given).indexOf(check)>=0);
    }
    public static void main(String[] args) 
    {
        String given = "Hello";
        String check = "loHel";

        RotationString rs = new RotationString();

        System.out.println(rs.toCheck(given, check));

    }    
}
