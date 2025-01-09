package com.shruti.sortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> temp = findDuplicates(nums);
        System.out.println(new TreeSet<>(temp));

    }

    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int index = 0; index < arr.length-1; index++) {
            if(arr[index] != index+1){
                al.add(arr[index]);
            }
        }
        return al;

    }

    static void swap(int[] nums, int max, int last) {
        int temp = nums[max];
        nums[max] = nums[last];
        nums[last] = temp;
    }
}
