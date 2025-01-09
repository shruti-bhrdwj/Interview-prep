package com.shruti.coreJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean isPalindrome = checkPalindrome(word);
        System.out.println(isPalindrome);

    }

    static boolean checkPalindrome(String str) {
        boolean res = true;
        for (int i = 0; i <= str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                res = false;
            }
        }
        return res;
    }
}
