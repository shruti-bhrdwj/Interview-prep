package com.shruti.sortingAlgos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38,27,43,3,9,82,10};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,6); //p is start index, r is end index
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int p,int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int n1= q-p+1;
        int n2= r-q;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0;i<n1;i++) leftArr[i] =arr[p+i];
        for(int j=0;j<n2; j++) rightArr[j] = arr[q+1+j];

        int i = 0;
        int j = 0;
        int k = p;
        while (i<n1 && j<n2) {
            if(leftArr[i]<= rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }


}
