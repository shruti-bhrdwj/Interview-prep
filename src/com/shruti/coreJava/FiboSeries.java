package com.shruti.coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        fibo(n);
    }

    static void fibo(int n) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + ", ");
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
