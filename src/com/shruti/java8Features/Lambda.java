package com.shruti.java8Features;

public class Lambda {

    public static void main(String[] args) {

        //using anonymous class
        InterForLambda obj = new InterForLambda() {
            @Override
            public int findMax(int[] arr) {
                int max=0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]>max) max=arr[i];
                }
                return max;
            }
        };

        // using lambda expression
        InterForLambda lambdaInter = (arr)-> {
            int max=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>max) max=arr[i];
            }
            return max;
        };

        int[] nums = {1,2,34,565,78,39,86};
        System.out.println(lambdaInter.findMax(nums));
        System.out.println(obj.findMax(nums));
    }
}
