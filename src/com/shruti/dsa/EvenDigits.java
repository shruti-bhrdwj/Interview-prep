package com.shruti.dsa;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {22,864,3,4567};
        int ans = countEven(nums);
        System.out.println(ans);
    }

    static int countEven(int[] nums) {
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

//    static boolean even(int num) {
//        if(Integer.toString(num).length()%2 == 0){
//            return true;
//        }
//        return false;
//    }

    static int digits(int num) {
        if(num<0){
            num= num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }

    static boolean even(int num) {
        int numofDigits = digits(num);
        if(numofDigits%2 == 0){
            return true;
        }
        return false;
    }
}
