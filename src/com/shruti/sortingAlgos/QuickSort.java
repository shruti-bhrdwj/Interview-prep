package com.shruti.sortingAlgos;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {23,3,56,2,1,18,24};
        quickSort(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap arr[j] and arr[i]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+1] with arr[pivot]
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;

        //return pivot
        return i+1;
    }

}
