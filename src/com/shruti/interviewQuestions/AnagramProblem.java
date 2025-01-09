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

        //boolean ans = checkAnagram(str,str1);
        boolean ans2 = checkAnagram2(str,str1);
        //System.out.println(ans);
        System.out.println(ans2);
    }

    private static boolean checkAnagram(String str, String str1) {

        int count = 0;
        if (str.length() == str1.length()) {
            Map<Character, Integer> map = new HashMap<>();
            for (char a : str.toCharArray()) {
                if (map.containsKey(a)) count++;
                map.replace(a, count);
                //if (str1.indexOf(a) <= -1) return false;
            }
            for (char a : str1.toCharArray()) {
                if (!map.containsKey(a)) return false;
            }
            return true;
        }
        return false;
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
