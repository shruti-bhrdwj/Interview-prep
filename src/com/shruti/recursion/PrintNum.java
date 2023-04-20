package com.shruti.recursion;

public class PrintNum {
    public static void main(String[] args) {
        print(1);
        System.out.println(fibo(6)); //6th number in fibo series
        System.out.println(fact(6)); //factorial of 6
    }

    private static void print(int n) {
        if(n>5) return;
        System.out.println(n);
        print(n+1);
    }

    public static int fibo(int num) {
        if(num<2){
            return num;
        }
        return fibo(num-1)+ fibo(num-2);
    }

    public static int fact(int num){
        if(num==1){
            return 1;
        }
        int ans = num*fact(num-1);
        return ans;
    }
}
