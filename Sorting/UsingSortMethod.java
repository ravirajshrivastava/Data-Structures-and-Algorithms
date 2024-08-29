package Sorting;

import java.util.Arrays;

public class UsingSortMethod
{    
    public static void main(String[] args) {
        int[] arr = {13,3743,237,86,386,3961,849,36,87,68,276,183,1754};
        
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i: arr)

        {
            System.out.print(i+" ");
        }
    }
}

