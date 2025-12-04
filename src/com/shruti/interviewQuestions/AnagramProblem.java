package com.shruti.interviewQuestions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();

        boolean ans = checkAnagram(str,str1);
        boolean ans2 = checkAnagram2(str,str1);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private static boolean checkAnagram(String str, String str1) {
        // If the lengths are different, return false
        if (str.length() != str1.length()) {
            return false;
        }

        // Create a map to count the frequency of characters
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character in the first string
        for (char a : str.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        // Decrease the frequency count based on the second string
        for (char a : str1.toCharArray()) {
            if (!map.containsKey(a)) {
                return false; // Character not found in the first string
            }

//            // Decrease the frequency count for each character
//            map.put(a, map.get(a) - 1);
//
//            // If any character frequency becomes negative, it's not an anagram
//            if (map.get(a) < 0) {
//                return false;
//            }
        }

        return true; // If all frequencies are zero, it's an anagram
    }


    private static boolean checkAnagram2(String str1, String str2){
        if(str1.length()==str2.length()){
            char[] str1Chars = str1.toCharArray();
            char[] str2Chars = str2.toCharArray();

            Arrays.sort(str1Chars);
            Arrays.sort(str2Chars);

            return Arrays.equals(str1Chars,str2Chars);

        }
        return false;
    }

}
