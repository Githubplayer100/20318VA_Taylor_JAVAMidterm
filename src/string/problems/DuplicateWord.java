package string.problems;

import java.util.*;
import java.lang.*;


public class DuplicateWord {
    public static void findDuplicates(String s)
    {
        //We tokenize the string.
        StringTokenizer st = new StringTokenizer(s);
        //we use hashmap to store in key value format.
        HashMap<String,Integer> map = new HashMap<String, Integer>();

        //Iterate through the tokens.
        while(st.hasMoreElements())
        {

            String item = st.nextToken();
            //If hashmap already has that string than simply update occurence.
            if(map.containsKey(item))
            {
                //when already present.
                map.put(item , map.get(item) + 1);
            }
            //Else add to the hashmap.
            else
            {
                map.put(item,1);
            }
        }
        //Foreach loop for map.
        map.forEach((key,value) -> {
            //If string occur more than one time than print it.
            if(value > 1)
            {
                System.out.println(key + "  " + value);
            }
        });
    }

    static  public float findAverageLength(String s)
    {
        //We tokenize the string.
        StringTokenizer st = new StringTokenizer(s);
        int n  = 0;
        int len = 0;
        while(st.hasMoreElements())
        {
            //Find total length and number of strings.
            len = len + st.nextToken().length();
            n++;
        }
        //Return the average.
        return len/n;
    }
    public static void main(String[] args)
    {
        String st = "java is a programming Language. java is also an Island of Indonesia. java is widely used language.";
        findDuplicates(st);
        System.out.println("Average Length is : " + findAverageLength(st));
    }



}
