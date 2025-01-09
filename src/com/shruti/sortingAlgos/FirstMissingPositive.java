package com.shruti.sortingAlgos;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i]> 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }
}
