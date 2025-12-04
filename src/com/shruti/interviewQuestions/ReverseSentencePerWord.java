package com.shruti.interviewQuestions;

import java.util.Scanner;

public class ReverseSentencePerWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        System.out.println(reverseSentencePerWord(arr));
        System.out.println(reverseFirstAndLastAlternate(arr));
    }

    private static String reverseFirstAndLastAlternate(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length / 2; i++) {
            sb.append(new StringBuilder(arr[i]).reverse() + " " + new StringBuilder(arr[arr.length - 1 - i]).reverse() + " ");
        }
        if(arr.length%2!=0) {
            sb.append(new StringBuilder(arr[arr.length/2]).reverse());
        }
        return sb.toString();
    }

    public static String reverseSentencePerWord(String[] arr){
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(new StringBuilder(s).reverse()+ " ");
        }
        return sb.toString();
    }
}
//Input
//The dog ate my cake
//output
//ehT god eta ym ekac
//ehT ekac god ym eta

