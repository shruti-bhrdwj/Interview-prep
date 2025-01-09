package com.shruti.dsa;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {10,9,8,7,6,5,4,3,2,1};
        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        int target = 4;
        System.out.println(orderAgnosticBS(nums,target));
        System.out.println(orderAgnosticBS(nums2,target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid]  == target) {
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
