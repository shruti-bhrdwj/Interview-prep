package com.shruti.interviewQuestions;

public class MissingNumInUnsortedArray {
    //Only for N natural numbers that should be in the list (from 1 to N)
    public static void main(String[] args) {
        int[] arr = {2,5,7,3,8,1,4};
        int result = getMissingNum(arr);
        System.out.println(result);
    }

    private static int getMissingNum(int[] arr) {
        int n = arr.length+1;
        int expectedSum = n*(n+1)/2;

        int totalSum = 0;
        for(int a:arr) totalSum = totalSum+a;

        return expectedSum - totalSum; //output 6 in this case
    }
}
