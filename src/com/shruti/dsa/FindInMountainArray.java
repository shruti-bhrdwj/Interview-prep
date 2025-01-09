package com.shruti.dsa;

public class FindInMountainArray {
    //mountain array : first inc till peak and then dec order
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,3,2,1};
        int ans = search(nums,3);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak = findPeak(arr);
        int firstAns = orderAgnosticBS(arr,target,0,peak);

        if (firstAns != -1){
            return firstAns;
        }
        int secondAns = orderAgnosticBS(arr,target,peak+1,arr.length-1);
        if (secondAns != -1){
            return secondAns;
        }
        return -1;
    }

    //find peak
    static int findPeak(int[] arr){
        int start =1;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else
                start = mid+1;
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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

