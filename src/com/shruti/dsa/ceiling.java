package com.shruti.dsa;

public class ceiling {
    public static void main(String[] args) {
        int[] nums = {2,4,6,12,14,16,18};
        int target = 15;
        int ans = ceil(nums,target);
        System.out.println(ans);
    }

    //index of ceil
    //ceil : the smallest no., greater than or equal to target
    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }

        }

        return start;
    }
}
