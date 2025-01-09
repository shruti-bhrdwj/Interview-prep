package com.shruti.dsa;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {2, 3, 4, 5},
                {6, 7, 8, 99},
                {9, 10, 13, 67}
        };
        int target = 8;
        int[] ans = searchElement(arr,target);
        System.out.println(Arrays.toString(ans));
        int ans2 = searchMax(arr);
        System.out.println(ans2);
    }

    static int[] searchElement(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[0];
    }

    static int searchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col] ;
                }
            }

        }
        return max;
    }
}
