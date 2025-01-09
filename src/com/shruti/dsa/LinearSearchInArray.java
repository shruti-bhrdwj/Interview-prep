package com.shruti.dsa;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] nums = {34,56,78,45,67};
        int target = 45;
        int ans1 = linearSearch(nums,target);
        System.out.println(ans1);
        int ans2 = linearSearch2(nums,target);
        System.out.println(ans2);
        boolean ans3 = linearSearch3(nums,target);
        System.out.println(ans3);
    }

    //search in the array, return index if item found
    //otherwise return -1 because it cannot be an index
    static int linearSearch(int[] arr, int target){
           if (arr.length==0){
               return -1;
           }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target)
                return index;

        }
        return  -1;
    }

    //search in the array, return element
    //otherwise return Integer.MIN_VALUE because -1 can be an element itself
    static int linearSearch2(int[] arr, int target){
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }

        for (int element : arr) {
            if(element == target)
                return element;

        }
        return  Integer.MIN_VALUE;
    }

    //search in the array, return true if found
    //otherwise return false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length==0){
            return false;
        }

        for (int element : arr) {
            if (element == target) return true;
        }

        return  false;
    }

}
