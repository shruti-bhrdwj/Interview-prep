package com.shruti.sortingAlgos;

import java.util.Arrays;

public class SetMismatch {
    //only work when num in range 1 to n
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return new int[] {index,index+1};
            }
        }
        return null;
    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }
}
