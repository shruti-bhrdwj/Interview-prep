package com.shruti.coreJava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fact = factorial(no);
        System.out.println(fact);
    }

    static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}
