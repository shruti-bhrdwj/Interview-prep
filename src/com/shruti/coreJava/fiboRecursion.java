package com.shruti.coreJava;

public class fiboRecursion {

    public static void main(String[] args) {
        int num =10;
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + "," );
        }
    }


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
