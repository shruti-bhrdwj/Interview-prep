package com.shruti.dsa;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,21,45,36,78,153};
        int max = max(arr);
        System.out.println(max);
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
