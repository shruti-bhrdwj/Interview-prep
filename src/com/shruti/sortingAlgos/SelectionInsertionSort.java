package com.shruti.sortingAlgos;

import java.util.Arrays;

public class SelectionInsertionSort {
    public static void main(String[] args) {
        int[] nums = {-5,9,14,0,6,12,11};
        int[] nums1 = {-5,9,14,0,6,12,11};
        selectionSort(nums);
        System.out.println("By selection sort: "+ Arrays.toString(nums));
        insertionSort(nums1);
        System.out.println("By insertion sort: "+ Arrays.toString(nums1));
    }

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length-i-1;
            int max = findMax(nums,0,last);
            swap(nums, max, last);
        }

    }

    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(nums[j]< nums[j-1]){
                    swap(nums, j,j-1 );
                } else {
                    break;
                }
            }
        }
    }

    static int findMax(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }

}