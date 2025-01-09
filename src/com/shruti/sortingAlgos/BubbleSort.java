package com.shruti.sortingAlgos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,9,14,6,12,11,12};
        bsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bsort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length-1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j+1] < nums[j]){
                    /* swap
                       a=c
                       c=b
                       b=a
                     */
                    int a = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = a;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
