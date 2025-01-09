package com.shruti.collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        //reverse2(nums);
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    //no extra memory (in-place algorithm)
    //O(N/2) i.e O(N) linear running time
    static void reverse(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr,int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    //new memory created
    static void reverse2(int[] nums){
        int[] reversed = new int[nums.length];
        for(int i =0;i< nums.length;i++){
            reversed[i] = nums[nums.length-1-i];
        }
        System.out.println(Arrays.toString(reversed));
    }

}
