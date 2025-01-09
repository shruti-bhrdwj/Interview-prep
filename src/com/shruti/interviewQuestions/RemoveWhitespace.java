package com.shruti.interviewQuestions;

import java.util.Scanner;

public class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(removeSpace(str));
        System.out.println(isPalindrome(str));
    }
    
    static String removeSpace(String input){
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c: chars) {
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static boolean isPalindrome(String input){
        boolean ans = true;
        for (int i = 0; i < input.length()-1/2; i++) {
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
