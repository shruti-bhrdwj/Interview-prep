package com.shruti.sortingAlgos;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
      int[] nums = {4,6,2,1,5,3};
      cycSort(nums);
      System.out.println(Arrays.toString(nums));
    }

    static void cycSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else
                i++;
        }
    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }

}
