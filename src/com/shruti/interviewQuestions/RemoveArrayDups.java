package com.shruti.interviewQuestions;

import java.util.Arrays;

public class RemoveArrayDups {
    public static void main(String[] args) {
        int[] arr = {2,3,6,3,5,6,8};

        Arrays.sort(arr); //2,3,3,5,6,6,8
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];

            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, j+1)));
    }
}
