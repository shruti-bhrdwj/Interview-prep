package com.shruti.sortingAlgos;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int num = duplicateNumber(nums);
        System.out.println(num);

    }

    static int duplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length-1; index++) {
            if(arr[index] != index+1){
                return arr[index];
            }
        }
        return -1;
    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }
}
