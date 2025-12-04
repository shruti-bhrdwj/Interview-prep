package com.shruti.interviewQuestions;

public class IntegerReverse {
    public static void main(String[] args) {
        int n = 168859;

        int ans = reverseNum(n);
        System.out.println(ans);
    }

    //constant memory solution
    private static int reverseNum(int n) {
        int reversed =0;
        int remainder =0;
        while(n>0){
            remainder = n%10;
            n = n/10;
            reversed = reversed*10 +remainder;
        }
        return reversed;
    }
}
