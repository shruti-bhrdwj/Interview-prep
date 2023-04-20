package com.shruti.collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1D array
        int[] nums = new int[5];
        for (int i =0;i< nums.length;i++) nums[i] = in.nextInt();

        //print the array
        for (int num : nums) {
           System.out.print(num + " ");
        }

        //print the array in better format
        System.out.println(Arrays.toString(nums));

        //2D array
        int[][] nums2 = {
                {1,2,3},
                {2,5},
                {3,6,8,7}
        };

        //print 2D array
        for (int row =0; row<nums2.length;row++){
            for(int col=0; col<nums2[row].length;col++){
                System.out.print(nums2[row][col]+ " ");
            }
            System.out.println();
        }

        //print 2D array in better format
        for(int[] a : nums2){
            System.out.println(Arrays.toString(a));
        }


    }

}
