package com.shruti.coreJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println("Enter operator");
        char op = in.next().trim().charAt(0);
        calculate(c,d,op);
    }

    public static void calculate(int a, int b, char op) {
        switch (op){
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> {
                if (b!=0) System.out.println(a/b);
                else System.out.println("cannot divide with zero");
            }
            default -> System.out.println("Enter valid operator");
        }
    }
}
