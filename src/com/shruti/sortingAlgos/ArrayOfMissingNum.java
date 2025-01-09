package com.shruti.sortingAlgos;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfMissingNum {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> misNums = findDisappearedNumbers(arr);
        System.out.println(misNums);

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else
                i++;
        }
        ArrayList<Integer> misNums = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                misNums.add(j+1);
            }
        }
        return misNums;
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

}
