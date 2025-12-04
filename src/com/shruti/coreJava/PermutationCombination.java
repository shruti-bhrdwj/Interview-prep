package com.shruti.coreJava;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc .nextInt();
        System.out.print("Enter r: ");

        int r = sc .nextInt();
        if (r > n) {
            System.out.println("Invalid input: r should be less than or equal to n.");
            return;
        }
        int perm = permutation(n,r);
        int comb = combination(n,r);
        System.out.println("Permutations: " + perm + " Combinations: " + comb);
    }

    private static int fact(int num) {
        if(num <=1){
            return 1;
        }
        return fact(num-1)* num;
    }

    private static int combination(int n, int r) {
        return fact(n)/(fact(n-r)*fact(r));
    }

    private static int permutation(int n, int r) {
        return fact(n)/fact(n-r);
    }
}
