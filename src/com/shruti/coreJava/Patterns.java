package com.shruti.coreJava;

public class Patterns {
    public static void main(String[] args) {
        rightTriangle(5);
        System.out.println("-----------------");
        square(5);
        System.out.println("-----------------");
        invertedTriangle(5);
        System.out.println("-----------------");
        pyramid(5);
        System.out.println("-----------------");
        HollowRectangle(4,5);
    }

    static void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void invertedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pyramid(int n) {

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void HollowRectangle(int n, int m){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                if(i==1||j==1||i==n||j==m) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
