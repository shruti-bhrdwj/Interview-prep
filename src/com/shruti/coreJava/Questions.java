package com.shruti.coreJava;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isPrime(n));
//        System.out.println(isArmstrong(n));

        //print all 3 digit armstrong nums
//        for (int i=100;i<1000;i++){
//            if(isArmstrong(i)){
//                System.out.print(i + " ");
//            }
//        }
        String ans = isSubstring("geeksforgeeks","sforg");
        System.out.println(ans);
    }

    //armstrong numbers eg 153 , 1^3 + 5^3 + 3^3 = 1+125+27 = 153
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) return false;
            c++;
        }
        return c * c > n;
    }

    static String isSubstring(String input1, String input2) {
        int n = input1.length();
        int m = input2.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == m) break;
            if (input2.charAt(count) == input1.charAt(i)) {
                count++;
            } else {
                if (count > 0) {
                    i -= count;
                }
                count = 0;

            }
        }
        return count==m?"yes": "no";
    }

}
