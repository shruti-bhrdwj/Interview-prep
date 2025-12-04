package com.shruti.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatChar {
    /*### **Problem: Find the First Non-repeated Character**

    Given a string, find and return the first character that does not repeat itself anywhere in the string.
     If all characters repeat or the string is empty, return null.

            ### **Example Usage:**

            - **Input:** "javaj"
            - **Output:** 'v'
            - **Input:** "aabbcc"
            - **Output:** null*/
    public static void main(String[] args) {
        String s = "aadcdedf";
        System.out.println(findNoRepeat(s));
    }

    public static Character findNoRepeat(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        //save char count in map
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        String repeat = "";

        //Find the first non-repeating character
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch; // Return the first non-repeating character
            }
        }

        return null; // No non-repeating character found
    }
}
