package com.shruti.coreJava;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc .nextInt();
        System.out.print("Enter r: ");
        int r = sc .nextInt();
        int perm = permutation(n,r);
        int comb = combination(n,r);
        System.out.println("Permutations: " + perm + " Combinations: " + comb);
    }

    private static int fact(int num) {
        int factorial;
        if(num <=1){
            return 1;
        }
        factorial = fact(num-1)* num;
        return factorial;
    }

    private static int combination(int n, int r) {
        return fact(n)/(fact(n-r)*fact(r));
    }

    private static int permutation(int n, int r) {
        return fact(n)/fact(n-r);
    }
}
