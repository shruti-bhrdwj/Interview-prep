package com.shruti.interviewQuestions;

import java.util.Scanner;

public class PalindromeNum {

    static boolean isNumPalindrome(int num){
        boolean ans = true;
        String temp = Integer.toString(num);

        int[] numArr = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++){
            numArr[i] = temp.charAt(i);
        }

        for (int i = 0; i < temp.length()/2; i++) {
            if(numArr[i]!=numArr[numArr.length-1-i]) ans = false;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        while(queries>0){
            int num = sc.nextInt();
            System.out.println(isNumPalindrome(num));
            queries--;
        }
        sc.close();
    }
}
