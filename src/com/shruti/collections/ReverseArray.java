package com.shruti.collections;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        /*reverse2(nums);*/
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    //no extra memory (in-place algorithm)
    //O(N/2) i.e O(N) linear running time
    static void reverse(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr,int num, int num1) {
        int temp = arr[num];
        arr[num] = arr[num1];
        arr[num1] = temp;
    }

    //new memory created
    static void reverse2(int[] nums){
        int[] newNums = new int[6];
        for(int i = 0; i<=newNums.length-1;i++){
            newNums[i] = nums[nums.length-1-i];
        }
        System.out.println(Arrays.toString(newNums));
    }

}
