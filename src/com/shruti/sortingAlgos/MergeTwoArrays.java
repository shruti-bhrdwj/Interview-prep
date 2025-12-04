package com.shruti.sortingAlgos;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,5,6,7,12,36};
        int[] arr2 = {1,3,4,8,9,11,23,45};

        int n= arr1.length, m = arr2.length;
        int[] merged = new int[n+m];

        int i=0,j=0,k=0;
        while(i<n &&j<m){
            if(arr1[i]<arr2[j]){
                merged[k++] = arr1[i++];
            }else merged[k++] = arr2[j++];
        }

        while(i<n){
            merged[k++] = arr1[i++];
        }

        while(j<m){
            merged[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(merged));

    }
}
