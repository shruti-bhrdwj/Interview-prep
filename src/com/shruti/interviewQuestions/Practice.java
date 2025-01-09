package com.shruti.interviewQuestions;

public class Practice {
    public static void main(String[] args) {
     int[] arr = {1,234,122,5,2,43};
     minMaxArrElement(arr);
     String s1 = "madamo";
     System.out.println(isPalidrome(s1));
     System.out.println(reverse(s1));
     System.out.println(isRightTriangle(4,4,5));
    }

    static String reverse(String s1) {
        /*StringBuilder s = new StringBuilder(s1);
        return s.reverse().toString();*/
        char[] s1Chars = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            char temp = s1.charAt(i);
            s1Chars[i] = s1.charAt(s1.length()-1-i);
            s1Chars[s1.length()-1-i] = temp;
        }
        return new String (s1Chars);
    }

    static boolean isRightTriangle(int base, int height, int hypotenuse) {
        return hypotenuse*hypotenuse == base*base + height*height;
    }

    static boolean isPalidrome(String s1) {
        boolean result = true;
        for (int i = 0; i < s1.length()/2; i++) {
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                result = false;
            }
        }
        return result;
    }

    static void minMaxArrElement(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(min + " "+ max);
    }


}
