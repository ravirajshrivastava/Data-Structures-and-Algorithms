//The given code is from the StarBetweenBars class, which counts stars ('*') that occur between pairs of bars ('|') 
//in a given character array. The code parses the character array to find sequences of stars between bars and sums 
//them.



// Logic:
// 1. The code iterates through the character array using a while loop. The iteration begins at i = 0 and continues until the end of the array.
// 2. If the current character is the first one (i.e., i == 0), it skips over it and increments i.
// 3. If the current character is the last one (i.e., i == chararray.length - 1), it returns the current sum.
// 4. If the current character is a '*', it initiates a nested loop:
//       4.1. The inner do-while loop checks if the previous character is a '*' or a '|'. If so, it increments the counter count and i.
//       4.2. This loop continues until the next '|' is found.
//       4.3. After counting the stars between bars, it adds count to the total sum sum.
// 5. The loop continues until the array is fully traversed.
// 6. Finally, it returns the total sum of stars between bars.



//The space complexity is O(1)
//Time Complexity is O(n);




package JusPayQuestions;

public class StarsBetweenBars 
{
    int countStars(char[] chararray)
    {
        int i = 0, sum =0;
        while (i< chararray.length)
        {
            // if(chararray[0] == '*' || chararray[0] == '|')
            if(i == 0)
            {
                i++;
            }
            else if(i == chararray.length-1 && chararray[i] == '*' )
            {
                return sum;
            }
            else if(chararray[i] == '*')
            {
                int count =0;
                do
                {
                    if(chararray[i-1] == '*' || chararray[i-1] == '|')
                    {
                        count++;
                        i++;
                    }
                }
                while(chararray[i] != '|');
                sum += count;
            }
            else
            {
                i++;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {

        String str = "||**|*|**|*|||*|";
        char[] chararray = str.toCharArray();
        StarBetweenBars sb = new StarBetweenBars();

        // int startIndex = chararray[0];
        // int endIndex =  chararray.length-1;
        
        System.out.println(sb.countStars(chararray));
    }
}
