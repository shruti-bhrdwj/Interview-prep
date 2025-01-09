package com.shruti.sortingAlgos;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1,4,6,2};
        int num = missingNumber(nums);
        System.out.println(num);

    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }
}
