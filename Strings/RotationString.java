// Rotate the elements of the string one by be one and match with the given string whether it is the one of 
// the rotated part of the original one or not

// New things :   substring()   ,   string concatenation   ,  string comparison using equals()

package Strings;


public class RotationString 
{
    String rotated;
    boolean toCheck(String given, String check)
    {
        if (given.length() != check.length()) 
        {
            return false;
        }
        for(int i=0; i<given.length(); i++)
        {
            rotated = given.substring(i) + given.substring(0, i);

            if(rotated.equals(check))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        String given = "Hello";
        String check = "elloH";

        RotationString rs = new RotationString();

        System.out.println(rs.toCheck(given, check));

    }    
}
